package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _C: ImageVector? = null

val Icons.Tr.C: ImageVector
    get() = _C ?: UXIcon(name = "C") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(13.04f, 24f)
                horizontalLineToRelative(-1.04f)
                curveToRelative(-5.51f, 0f, -10.0f, -4.45f, -10.0f, -9.91f)
                verticalLineToRelative(-4.18f)
                curveTo(2f, 4.45f, 6.49f, 0f, 12.0f, 0f)
                horizontalLineToRelative(1.04f)
                curveToRelative(3.79f, 0f, 7.19f, 2.11f, 8.88f, 5.5f)
                curveToRelative(0.12f, 0.25f, 0.02f, 0.55f, -0.23f, 0.67f)
                curveToRelative(-0.24f, 0.12f, -0.55f, 0.02f, -0.67f, -0.23f)
                curveToRelative(-1.52f, -3.05f, -4.58f, -4.95f, -7.98f, -4.95f)
                horizontalLineToRelative(-1.04f)
                curveTo(7.04f, 1f, 3f, 5.0f, 3f, 9.91f)
                verticalLineToRelative(4.18f)
                curveToRelative(0f, 4.91f, 4.04f, 8.91f, 9.0f, 8.91f)
                horizontalLineToRelative(1.04f)
                curveToRelative(3.35f, 0f, 6.38f, -1.85f, 7.92f, -4.82f)
                curveToRelative(0.13f, -0.25f, 0.43f, -0.34f, 0.67f, -0.21f)
                curveToRelative(0.24f, 0.13f, 0.34f, 0.43f, 0.21f, 0.67f)
                curveToRelative(-1.71f, 3.31f, -5.09f, 5.37f, -8.81f, 5.37f)
                close()
            }
        }.also { _C = it}
