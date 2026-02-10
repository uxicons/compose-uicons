package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WalletChange: ImageVector? = null

val Icons.Ts.WalletChange: ImageVector
    get() = _WalletChange ?: UXIcon(name = "WalletChange") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(1f, 2.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(21.5f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(-10.26f)
                curveToRelative(0.08f, -0.33f, 0.15f, -0.66f, 0.19f, -1f)
                horizontalLineToRelative(9.07f)
                verticalLineToRelative(-14f)
                horizontalLineToRelative(-20.5f)
                curveToRelative(-0.56f, 0f, -1.08f, -0.2f, -1.5f, -0.51f)
                verticalLineToRelative(7.27f)
                curveToRelative(-0.36f, 0.29f, -0.69f, 0.61f, -1f, 0.96f)
                verticalLineToRelative(-10.22f)
                curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
                horizontalLineToRelative(21.5f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-21.5f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                close()
                moveTo(21f, 12f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                close()
                moveTo(11f, 14.73f)
                curveToRelative(-1.07f, -1.64f, -2.9f, -2.73f, -5f, -2.73f)
                curveToRelative(-3.31f, 0f, -6f, 2.69f, -6f, 6f)
                horizontalLineToRelative(1f)
                curveToRelative(0f, -2.76f, 2.24f, -5f, 5f, -5f)
                curveToRelative(1.63f, 0f, 3.07f, 0.79f, 3.98f, 2f)
                horizontalLineToRelative(-1.98f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(3f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(-1f)
                close()
                moveTo(6f, 23f)
                curveToRelative(-1.63f, 0f, -3.06f, -0.79f, -3.97f, -2f)
                horizontalLineToRelative(1.97f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(1f)
                verticalLineToRelative(-2.71f)
                curveToRelative(1.07f, 1.63f, 2.91f, 2.71f, 5f, 2.71f)
                curveToRelative(3.31f, 0f, 6f, -2.69f, 6f, -6f)
                horizontalLineToRelative(-1f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                close()
            }
        }.also { _WalletChange = it}
