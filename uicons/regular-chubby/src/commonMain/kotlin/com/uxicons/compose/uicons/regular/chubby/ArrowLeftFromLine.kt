package com.uxicons.compose.uicons.regular.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowLeftFromLine: ImageVector? = null

val Icons.Rc.ArrowLeftFromLine: ImageVector
    get() = _ArrowLeftFromLine ?: UXIcon(name = "ArrowLeftFromLine") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 2f)
                verticalLineToRelative(20f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-20f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(17f, 11f)
                horizontalLineToRelative(-13.03f)
                curveToRelative(1.27f, -1.59f, 2.79f, -2.99f, 4.58f, -4.16f)
                curveToRelative(0.46f, -0.3f, 0.59f, -0.92f, 0.29f, -1.39f)
                curveToRelative(-0.3f, -0.46f, -0.92f, -0.59f, -1.38f, -0.29f)
                curveToRelative(-2.58f, 1.69f, -4.7f, 3.81f, -6.29f, 6.3f)
                curveToRelative(-0.21f, 0.33f, -0.21f, 0.75f, 0f, 1.08f)
                curveToRelative(1.59f, 2.49f, 3.71f, 4.61f, 6.29f, 6.3f)
                curveToRelative(0.46f, 0.3f, 1.08f, 0.18f, 1.38f, -0.29f)
                curveToRelative(0.3f, -0.46f, 0.17f, -1.08f, -0.29f, -1.39f)
                curveToRelative(-1.79f, -1.17f, -3.31f, -2.57f, -4.58f, -4.16f)
                horizontalLineToRelative(13.03f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _ArrowLeftFromLine = it}
