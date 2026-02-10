package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ShieldExclamation: ImageVector? = null

val Icons.Ts.ShieldExclamation: ImageVector
    get() = _ShieldExclamation ?: UXIcon(name = "ShieldExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12.5f, 15f)
                horizontalLineToRelative(-1f)
                lineTo(11.5f, 5f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(10f)
                close()
                moveTo(22f, 5.14f)
                verticalLineToRelative(6.74f)
                curveToRelative(0f, 7.5f, -7.17f, 10.97f, -9.37f, 11.85f)
                lineToRelative(-0.65f, 0.26f)
                lineToRelative(-0.62f, -0.31f)
                curveToRelative(-2.19f, -1.1f, -9.35f, -5.19f, -9.35f, -11.8f)
                verticalLineToRelative(-6.74f)
                curveToRelative(0f, -1.08f, 0.69f, -2.03f, 1.71f, -2.37f)
                lineTo(12f, 0.03f)
                lineToRelative(8.29f, 2.75f)
                curveToRelative(1.02f, 0.34f, 1.71f, 1.29f, 1.71f, 2.37f)
                close()
                moveTo(21f, 5.14f)
                curveToRelative(0f, -0.65f, -0.41f, -1.22f, -1.03f, -1.42f)
                lineToRelative(-7.97f, -2.64f)
                lineToRelative(-7.97f, 2.64f)
                curveToRelative(-0.61f, 0.2f, -1.03f, 0.78f, -1.03f, 1.42f)
                verticalLineToRelative(6.74f)
                curveToRelative(0f, 6.04f, 6.96f, 9.98f, 9.03f, 11.02f)
                curveToRelative(2.05f, -0.83f, 8.97f, -4.15f, 8.97f, -11.02f)
                verticalLineToRelative(-6.74f)
                close()
                moveTo(12f, 17f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _ShieldExclamation = it}
