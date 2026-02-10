package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MedicalStar: ImageVector? = null

val Icons.Bs.MedicalStar: ImageVector
    get() = _MedicalStar ?: UXIcon(name = "MedicalStar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(14.83f, 12f)
                lineToRelative(8.14f, 4.99f)
                lineToRelative(-1.57f, 2.56f)
                lineToRelative(-7.95f, -4.87f)
                verticalLineToRelative(9.32f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-9.32f)
                lineToRelative(-7.95f, 4.87f)
                lineToRelative(-1.57f, -2.56f)
                lineToRelative(8.14f, -4.99f)
                lineTo(0.94f, 7.01f)
                lineToRelative(1.57f, -2.56f)
                lineToRelative(7.95f, 4.87f)
                verticalLineTo(0f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(9.32f)
                lineToRelative(7.95f, -4.87f)
                lineToRelative(1.57f, 2.56f)
                lineToRelative(-8.14f, 4.99f)
                close()
            }
        }.also { _MedicalStar = it}
