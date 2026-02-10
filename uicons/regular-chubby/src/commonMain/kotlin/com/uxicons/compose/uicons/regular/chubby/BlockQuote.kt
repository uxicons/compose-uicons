package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BlockQuote: ImageVector? = null

val Icons.Rc.BlockQuote: ImageVector
    get() = _BlockQuote ?: UXIcon(name = "BlockQuote") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(22.97f, 13.24f)
                curveToRelative(-0.13f, 0.54f, -0.69f, 0.86f, -1.21f, 0.73f)
                curveToRelative(-0.04f, -0.01f, -3.97f, -0.97f, -9.76f, -0.97f)
                curveToRelative(-1.65f, 0f, -3.3f, 0.08f, -4.91f, 0.23f)
                curveToRelative(-0.56f, 0.05f, -1.04f, -0.35f, -1.09f, -0.9f)
                curveToRelative(-0.05f, -0.55f, 0.35f, -1.04f, 0.9f, -1.09f)
                curveToRelative(1.67f, -0.16f, 3.38f, -0.24f, 5.09f, -0.24f)
                curveToRelative(6.05f, 0f, 10.07f, 0.99f, 10.24f, 1.03f)
                curveToRelative(0.54f, 0.13f, 0.86f, 0.68f, 0.73f, 1.21f)
                close()
                moveTo(22.24f, 19.03f)
                curveToRelative(-0.17f, -0.04f, -4.19f, -1.03f, -10.24f, -1.03f)
                curveToRelative(-1.71f, 0f, -3.43f, 0.08f, -5.09f, 0.24f)
                curveToRelative(-0.55f, 0.05f, -0.95f, 0.54f, -0.9f, 1.09f)
                curveToRelative(0.05f, 0.55f, 0.53f, 0.97f, 1.09f, 0.9f)
                curveToRelative(1.6f, -0.15f, 3.25f, -0.23f, 4.91f, -0.23f)
                curveToRelative(5.79f, 0f, 9.72f, 0.96f, 9.76f, 0.97f)
                curveToRelative(0.52f, 0.13f, 1.08f, -0.19f, 1.21f, -0.73f)
                curveToRelative(0.13f, -0.54f, -0.19f, -1.08f, -0.73f, -1.21f)
                close()
                moveTo(2.24f, 6.97f)
                curveToRelative(0.04f, -0.01f, 3.97f, -0.97f, 9.76f, -0.97f)
                reflectiveCurveToRelative(9.72f, 0.96f, 9.76f, 0.97f)
                curveToRelative(0.52f, 0.13f, 1.08f, -0.19f, 1.21f, -0.73f)
                curveToRelative(0.13f, -0.54f, -0.19f, -1.08f, -0.73f, -1.21f)
                curveToRelative(-0.17f, -0.04f, -4.19f, -1.03f, -10.24f, -1.03f)
                reflectiveCurveToRelative(-10.07f, 0.99f, -10.24f, 1.03f)
                curveToRelative(-0.54f, 0.13f, -0.86f, 0.68f, -0.73f, 1.21f)
                reflectiveCurveToRelative(0.68f, 0.86f, 1.21f, 0.73f)
                close()
                moveTo(2f, 12f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-7f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _BlockQuote = it}
