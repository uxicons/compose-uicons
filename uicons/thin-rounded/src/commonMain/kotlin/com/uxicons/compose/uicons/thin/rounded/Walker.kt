package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Walker: ImageVector? = null

val Icons.Tr.Walker: ImageVector
    get() = _Walker ?: UXIcon(name = "Walker") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22f, 19.05f)
                lineTo(22f, 4f)
                curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
                horizontalLineToRelative(-6.21f)
                curveToRelative(-1.88f, 0f, -3.57f, 1.18f, -4.22f, 2.94f)
                lineTo(0.03f, 23.33f)
                curveToRelative(-0.1f, 0.26f, 0.04f, 0.55f, 0.3f, 0.64f)
                curveToRelative(0.06f, 0.02f, 0.12f, 0.03f, 0.17f, 0.03f)
                curveToRelative(0.2f, 0f, 0.4f, -0.12f, 0.47f, -0.33f)
                lineToRelative(4.68f, -12.67f)
                horizontalLineToRelative(15.35f)
                verticalLineToRelative(8.05f)
                curveToRelative(-1.14f, 0.23f, -2f, 1.24f, -2f, 2.45f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0f, -1.21f, -0.86f, -2.22f, -2f, -2.45f)
                close()
                moveTo(6.02f, 10f)
                lineToRelative(2.48f, -6.71f)
                curveToRelative(0.51f, -1.37f, 1.82f, -2.29f, 3.28f, -2.29f)
                horizontalLineToRelative(6.21f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(6f)
                lineTo(6.02f, 10f)
                close()
                moveTo(21.5f, 23f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _Walker = it}
