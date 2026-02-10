package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MedicalStar: ImageVector? = null

val Icons.Ts.MedicalStar: ImageVector
    get() = _MedicalStar ?: UXIcon(name = "MedicalStar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.92f, 12f)
                lineToRelative(9.54f, 5.84f)
                lineToRelative(-0.52f, 0.85f)
                lineToRelative(-9.47f, -5.8f)
                verticalLineToRelative(11.11f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(-11.11f)
                lineTo(1.99f, 18.69f)
                lineToRelative(-0.52f, -0.85f)
                lineToRelative(9.54f, -5.84f)
                lineTo(1.47f, 6.16f)
                lineToRelative(0.52f, -0.85f)
                lineToRelative(9.47f, 5.8f)
                verticalLineTo(0f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(11.11f)
                lineToRelative(9.47f, -5.8f)
                lineToRelative(0.52f, 0.85f)
                lineToRelative(-9.54f, 5.84f)
                close()
            }
        }.also { _MedicalStar = it}
