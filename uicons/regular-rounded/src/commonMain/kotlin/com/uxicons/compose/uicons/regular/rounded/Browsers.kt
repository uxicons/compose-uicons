package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Browsers: ImageVector? = null

val Icons.Rr.Browsers: ImageVector
    get() = _Browsers ?: UXIcon(name = "Browsers") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19f, 2f)
                lineTo(10f, 2f)
                curveToRelative(-2.76f, 0f, -5f, 2.24f, -5f, 5f)
                verticalLineToRelative(6f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(9f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                lineTo(24f, 7f)
                curveToRelative(0f, -2.76f, -2.24f, -5f, -5f, -5f)
                close()
                moveTo(10f, 4f)
                horizontalLineToRelative(9f)
                curveToRelative(1.3f, 0f, 2.4f, 0.84f, 2.82f, 2f)
                lineTo(7.18f, 6f)
                curveToRelative(0.41f, -1.16f, 1.51f, -2f, 2.82f, -2f)
                close()
                moveTo(19f, 16f)
                lineTo(10f, 16f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(15f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                close()
                moveTo(17f, 21f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(5f, 22f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                verticalLineToRelative(-7.35f)
                curveToRelative(0f, -1.22f, 0.44f, -2.39f, 1.25f, -3.31f)
                curveToRelative(0.37f, -0.41f, 1f, -0.45f, 1.41f, -0.09f)
                curveToRelative(0.42f, 0.37f, 0.45f, 1f, 0.09f, 1.41f)
                curveToRelative(-0.48f, 0.55f, -0.75f, 1.25f, -0.75f, 1.98f)
                verticalLineToRelative(7.35f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(11f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                close()
            }
        }.also { _Browsers = it}
