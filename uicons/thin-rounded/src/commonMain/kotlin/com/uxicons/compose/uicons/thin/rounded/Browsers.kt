package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Browsers: ImageVector? = null

val Icons.Tr.Browsers: ImageVector
    get() = _Browsers ?: UXIcon(name = "Browsers") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.5f, 2f)
                lineTo(9.5f, 2f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(10f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(24f, 6.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(9.5f, 3f)
                horizontalLineToRelative(10f)
                curveToRelative(1.76f, 0f, 3.2f, 1.31f, 3.45f, 3f)
                lineTo(6.05f, 6f)
                curveToRelative(0.25f, -1.69f, 1.69f, -3f, 3.45f, -3f)
                close()
                moveTo(19.5f, 17f)
                lineTo(9.5f, 17f)
                curveToRelative(-1.93f, 0f, -3.5f, -1.57f, -3.5f, -3.5f)
                lineTo(6f, 7f)
                lineTo(23f, 7f)
                verticalLineToRelative(6.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                close()
                moveTo(17.88f, 20.17f)
                curveToRelative(0.18f, 0.21f, 0.16f, 0.52f, -0.04f, 0.71f)
                curveToRelative(-0.82f, 0.73f, -1.88f, 1.12f, -2.98f, 1.12f)
                lineTo(4.5f, 22f)
                curveToRelative(-2.48f, 0f, -4.5f, -2.02f, -4.5f, -4.5f)
                verticalLineToRelative(-7.54f)
                curveToRelative(0f, -1.6f, 0.86f, -3.1f, 2.25f, -3.9f)
                curveToRelative(0.24f, -0.14f, 0.54f, -0.06f, 0.68f, 0.18f)
                curveToRelative(0.14f, 0.24f, 0.06f, 0.54f, -0.18f, 0.68f)
                curveToRelative(-1.08f, 0.62f, -1.75f, 1.79f, -1.75f, 3.03f)
                verticalLineToRelative(7.54f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                lineTo(14.85f, 20.99f)
                curveToRelative(0.85f, 0f, 1.67f, -0.31f, 2.31f, -0.88f)
                curveToRelative(0.21f, -0.18f, 0.52f, -0.16f, 0.71f, 0.04f)
                close()
            }
        }.also { _Browsers = it}
