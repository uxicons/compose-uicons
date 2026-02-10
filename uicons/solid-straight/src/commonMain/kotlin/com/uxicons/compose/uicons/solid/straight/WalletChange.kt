package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _WalletChange: ImageVector? = null

val Icons.Ss.WalletChange: ImageVector
    get() = _WalletChange ?: UXIcon(name = "WalletChange") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10f, 12f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1.64f)
                curveToRelative(-0.72f, -0.63f, -1.64f, -1f, -2.64f, -1f)
                curveToRelative(-1.86f, 0f, -3.41f, 1.28f, -3.86f, 3f)
                horizontalLineToRelative(-2.05f)
                curveToRelative(0.48f, -2.83f, 2.94f, -5f, 5.91f, -5f)
                curveToRelative(1.52f, 0f, 2.92f, 0.56f, 4f, 1.53f)
                close()
                moveTo(6f, 22f)
                curveToRelative(-0.99f, 0f, -1.93f, -0.37f, -2.65f, -1f)
                horizontalLineToRelative(1.65f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-1.53f)
                curveToRelative(1.08f, 0.97f, 2.49f, 1.53f, 4f, 1.53f)
                curveToRelative(2.97f, 0f, 5.43f, -2.17f, 5.91f, -5f)
                horizontalLineToRelative(-2.05f)
                curveToRelative(-0.45f, 1.72f, -2.0f, 3f, -3.86f, 3f)
                close()
                moveTo(2f, 3f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(16f)
                horizontalLineToRelative(-10.26f)
                curveToRelative(0.17f, -0.64f, 0.26f, -1.31f, 0.26f, -2f)
                verticalLineToRelative(-8f)
                horizontalLineToRelative(-8f)
                curveToRelative(-2.39f, 0f, -4.53f, 1.06f, -6f, 2.72f)
                verticalLineToRelative(-9.72f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(21f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-21f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                close()
                moveTo(19f, 12f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                close()
            }
        }.also { _WalletChange = it}
