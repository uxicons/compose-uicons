package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Damage: ImageVector? = null

val Icons.Tr.Damage: ImageVector
    get() = _Damage ?: UXIcon(name = "Damage") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.5f, 0f)
                lineTo(4.5f, 0f)
                curveTo(2.02f, 0f, 0f, 2.02f, 0f, 4.5f)
                verticalLineToRelative(15f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(24f, 4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(23f, 19.5f)
                curveToRelative(0f, 0.79f, -0.27f, 1.5f, -0.71f, 2.09f)
                lineToRelative(-5.44f, -5.44f)
                curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0f)
                reflectiveCurveToRelative(-0.2f, 0.51f, 0f, 0.71f)
                lineToRelative(5.44f, 5.44f)
                curveToRelative(-0.58f, 0.44f, -1.3f, 0.71f, -2.09f, 0.71f)
                lineTo(4.5f, 23f)
                curveToRelative(-1.27f, 0f, -2.37f, -0.69f, -2.98f, -1.7f)
                lineToRelative(9.71f, -4.85f)
                curveToRelative(0.25f, -0.12f, 0.35f, -0.42f, 0.22f, -0.67f)
                curveToRelative(-0.12f, -0.25f, -0.42f, -0.35f, -0.67f, -0.22f)
                lineToRelative(-3.78f, 1.89f)
                verticalLineToRelative(-3.94f)
                curveToRelative(0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f)
                reflectiveCurveToRelative(-0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(4.44f)
                lineToRelative(-4.88f, 2.44f)
                curveToRelative(-0.07f, -0.28f, -0.12f, -0.57f, -0.12f, -0.88f)
                lineTo(1.0f, 4.5f)
                curveToRelative(0f, -1.93f, 1.57f, -3.5f, 3.5f, -3.5f)
                horizontalLineToRelative(2.7f)
                lineToRelative(2.52f, 4.69f)
                curveToRelative(0.44f, 0.81f, 1.28f, 1.31f, 2.2f, 1.31f)
                horizontalLineToRelative(1.8f)
                lineToRelative(2.35f, 3.77f)
                curveToRelative(0.1f, 0.15f, 0.26f, 0.23f, 0.42f, 0.23f)
                curveToRelative(0.09f, 0f, 0.18f, -0.02f, 0.27f, -0.08f)
                curveToRelative(0.23f, -0.15f, 0.3f, -0.46f, 0.16f, -0.69f)
                lineToRelative(-2.02f, -3.23f)
                horizontalLineToRelative(3.6f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                horizontalLineToRelative(-6.57f)
                curveToRelative(-0.55f, 0f, -1.06f, -0.3f, -1.32f, -0.79f)
                lineToRelative(-2.27f, -4.21f)
                horizontalLineToRelative(11.16f)
                curveToRelative(1.93f, 0f, 3.5f, 1.57f, 3.5f, 3.5f)
                verticalLineToRelative(15f)
                close()
            }
        }.also { _Damage = it}
