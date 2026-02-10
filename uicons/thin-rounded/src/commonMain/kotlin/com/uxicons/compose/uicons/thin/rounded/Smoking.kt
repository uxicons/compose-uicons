package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Smoking: ImageVector? = null

val Icons.Tr.Smoking: ImageVector
    get() = _Smoking ?: UXIcon(name = "Smoking") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 16f)
                lineTo(2f, 16f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                horizontalLineToRelative(18.5f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                close()
                moveTo(1f, 20f)
                verticalLineToRelative(-2f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(4f)
                lineTo(2f, 21f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
                moveTo(20f, 21f)
                horizontalLineToRelative(-11f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(11f)
                verticalLineToRelative(4f)
                close()
                moveTo(24f, 16.5f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                close()
                moveTo(14f, 4.86f)
                verticalLineToRelative(-2.36f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(2.36f)
                curveToRelative(0f, 1.22f, 0.65f, 2.37f, 1.7f, 3.0f)
                lineToRelative(1.6f, 0.96f)
                curveToRelative(1.05f, 0.63f, 1.7f, 1.78f, 1.7f, 3.0f)
                verticalLineToRelative(1.68f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-1.68f)
                curveToRelative(0f, -0.87f, -0.47f, -1.69f, -1.21f, -2.15f)
                lineToRelative(-1.6f, -0.96f)
                curveToRelative(-1.35f, -0.81f, -2.19f, -2.29f, -2.19f, -3.86f)
                close()
                moveTo(24f, 10.26f)
                verticalLineToRelative(1.24f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-1.24f)
                curveToRelative(0f, -1.22f, -0.65f, -2.37f, -1.7f, -3.0f)
                lineToRelative(-2.09f, -1.25f)
                curveToRelative(-0.75f, -0.45f, -1.21f, -1.27f, -1.21f, -2.15f)
                lineTo(18f, 0.5f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(3.37f)
                curveToRelative(0f, 0.52f, 0.28f, 1.02f, 0.73f, 1.29f)
                lineToRelative(2.09f, 1.25f)
                curveToRelative(1.35f, 0.81f, 2.19f, 2.29f, 2.19f, 3.86f)
                close()
            }
        }.also { _Smoking = it}
