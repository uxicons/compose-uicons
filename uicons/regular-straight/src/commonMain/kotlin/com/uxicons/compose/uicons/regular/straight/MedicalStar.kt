package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MedicalStar: ImageVector? = null

val Icons.Rs.MedicalStar: ImageVector
    get() = _MedicalStar ?: UXIcon(name = "MedicalStar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13.87f, 12f)
                lineToRelative(8.84f, 5.41f)
                lineToRelative(-1.04f, 1.71f)
                lineToRelative(-8.71f, -5.33f)
                verticalLineToRelative(10.21f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-10.21f)
                lineToRelative(-8.71f, 5.33f)
                lineToRelative(-1.04f, -1.71f)
                lineToRelative(8.84f, -5.41f)
                lineTo(1.2f, 6.59f)
                lineToRelative(1.04f, -1.71f)
                lineToRelative(8.71f, 5.33f)
                verticalLineTo(0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(10.21f)
                lineToRelative(8.71f, -5.33f)
                lineToRelative(1.04f, 1.71f)
                lineToRelative(-8.84f, 5.41f)
                close()
            }
        }.also { _MedicalStar = it}
