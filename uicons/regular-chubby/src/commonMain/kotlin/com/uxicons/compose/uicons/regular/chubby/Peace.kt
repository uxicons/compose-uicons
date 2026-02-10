package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Peace: ImageVector? = null

val Icons.Rc.Peace: ImageVector
    get() = _Peace ?: UXIcon(name = "Peace") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 1f)
                curveToRelative(-7.71f, 0f, -11f, 3.29f, -11f, 11f)
                reflectiveCurveToRelative(3.29f, 11f, 11f, 11f)
                reflectiveCurveToRelative(11f, -3.29f, 11f, -11f)
                reflectiveCurveToRelative(-3.29f, -11f, -11f, -11f)
                close()
                moveTo(21f, 12f)
                curveToRelative(0f, 1.78f, -0.19f, 3.24f, -0.58f, 4.45f)
                curveToRelative(-2.82f, -4.06f, -6.13f, -6.28f, -7.42f, -7.04f)
                verticalLineToRelative(-6.39f)
                curveToRelative(5.8f, 0.25f, 8f, 2.76f, 8f, 8.97f)
                close()
                moveTo(11f, 3.02f)
                verticalLineToRelative(6.39f)
                curveToRelative(-1.29f, 0.76f, -4.61f, 2.97f, -7.43f, 7.02f)
                curveToRelative(-0.39f, -1.2f, -0.57f, -2.66f, -0.57f, -4.43f)
                curveToRelative(0f, -6.21f, 2.19f, -8.73f, 8f, -8.97f)
                close()
                moveTo(4.62f, 18.48f)
                curveToRelative(2.15f, -3.41f, 4.77f, -5.58f, 6.38f, -6.68f)
                verticalLineToRelative(9.18f)
                curveToRelative(-3.06f, -0.13f, -5.12f, -0.89f, -6.38f, -2.49f)
                close()
                moveTo(13f, 20.98f)
                verticalLineToRelative(-9.18f)
                curveToRelative(1.6f, 1.11f, 4.22f, 3.28f, 6.36f, 6.69f)
                curveToRelative(-1.26f, 1.59f, -3.31f, 2.35f, -6.36f, 2.48f)
                close()
            }
        }.also { _Peace = it}
