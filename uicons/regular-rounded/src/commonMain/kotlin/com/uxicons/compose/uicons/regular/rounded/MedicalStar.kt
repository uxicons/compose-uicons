package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MedicalStar: ImageVector? = null

val Icons.Rr.MedicalStar: ImageVector
    get() = _MedicalStar ?: UXIcon(name = "MedicalStar") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.19f, 18.27f)
                curveToRelative(-0.19f, 0.31f, -0.52f, 0.48f, -0.85f, 0.48f)
                curveToRelative(-0.18f, 0f, -0.36f, -0.05f, -0.52f, -0.15f)
                lineToRelative(-7.86f, -4.81f)
                verticalLineToRelative(9.21f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-9.21f)
                lineToRelative(-7.86f, 4.81f)
                curveToRelative(-0.16f, 0.1f, -0.34f, 0.15f, -0.52f, 0.15f)
                curveToRelative(-0.34f, 0f, -0.67f, -0.17f, -0.85f, -0.48f)
                curveToRelative(-0.29f, -0.47f, -0.14f, -1.09f, 0.33f, -1.38f)
                lineToRelative(7.99f, -4.89f)
                lineTo(2.06f, 7.11f)
                curveToRelative(-0.47f, -0.29f, -0.62f, -0.9f, -0.33f, -1.38f)
                curveToRelative(0.29f, -0.47f, 0.9f, -0.62f, 1.38f, -0.33f)
                lineToRelative(7.86f, 4.81f)
                verticalLineTo(1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(9.21f)
                lineToRelative(7.86f, -4.81f)
                curveToRelative(0.47f, -0.29f, 1.09f, -0.14f, 1.38f, 0.33f)
                curveToRelative(0.29f, 0.47f, 0.14f, 1.09f, -0.33f, 1.38f)
                lineToRelative(-7.99f, 4.89f)
                lineToRelative(7.99f, 4.89f)
                curveToRelative(0.47f, 0.29f, 0.62f, 0.9f, 0.33f, 1.38f)
                close()
            }
        }.also { _MedicalStar = it}
