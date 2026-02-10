package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ArrowLeftFromLine: ImageVector? = null

val Icons.Sc.ArrowLeftFromLine: ImageVector
    get() = _ArrowLeftFromLine ?: UXIcon(name = "ArrowLeftFromLine") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 2.5f)
                verticalLineToRelative(19f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                reflectiveCurveToRelative(-1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-19f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                close()
                moveTo(16.5f, 10.5f)
                horizontalLineToRelative(-10.93f)
                curveToRelative(0.95f, -1.02f, 2.03f, -1.95f, 3.25f, -2.74f)
                curveToRelative(0.69f, -0.45f, 0.89f, -1.38f, 0.43f, -2.08f)
                curveToRelative(-0.45f, -0.69f, -1.38f, -0.89f, -2.08f, -0.43f)
                curveToRelative(-2.44f, 1.6f, -4.44f, 3.6f, -5.94f, 5.95f)
                curveToRelative(-0.32f, 0.49f, -0.32f, 1.12f, 0f, 1.62f)
                curveToRelative(1.5f, 2.35f, 3.5f, 4.35f, 5.94f, 5.95f)
                curveToRelative(0.68f, 0.45f, 1.62f, 0.26f, 2.08f, -0.43f)
                curveToRelative(0.45f, -0.69f, 0.26f, -1.62f, -0.43f, -2.08f)
                curveToRelative(-1.22f, -0.8f, -2.3f, -1.72f, -3.25f, -2.74f)
                horizontalLineToRelative(10.93f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                reflectiveCurveToRelative(-0.67f, -1.5f, -1.5f, -1.5f)
                close()
            }
        }.also { _ArrowLeftFromLine = it}
