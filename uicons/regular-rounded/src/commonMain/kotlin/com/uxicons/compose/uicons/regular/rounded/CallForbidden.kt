package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CallForbidden: ImageVector? = null

val Icons.Rr.CallForbidden: ImageVector
    get() = _CallForbidden ?: UXIcon(name = "CallForbidden") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                reflectiveCurveToRelative(12f, -5.38f, 12f, -12f)
                reflectiveCurveTo(18.62f, 0f, 12f, 0f)
                close()
                moveTo(12f, 2f)
                curveToRelative(2.4f, 0f, 4.6f, 0.85f, 6.33f, 2.26f)
                lineToRelative(-1.71f, 1.71f)
                curveToRelative(-1.59f, -1.27f, -3.56f, -1.97f, -5.62f, -1.97f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                curveToRelative(1.52f, 0f, 2.98f, 0.49f, 4.19f, 1.4f)
                lineToRelative(-1.44f, 1.44f)
                curveToRelative(-0.81f, -0.54f, -1.76f, -0.83f, -2.75f, -0.83f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                curveToRelative(0.45f, 0f, 0.89f, 0.11f, 1.28f, 0.3f)
                lineToRelative(-3.96f, 3.96f)
                curveToRelative(-0.43f, -0.58f, -0.81f, -1.23f, -1.11f, -1.98f)
                lineToRelative(1.02f, -1.04f)
                curveToRelative(0.45f, -0.45f, 0.45f, -1.17f, 0f, -1.62f)
                lineToRelative(-1.21f, -1.3f)
                curveToRelative(-0.45f, -0.45f, -1.17f, -0.45f, -1.62f, 0f)
                lineToRelative(-0.6f, 0.52f)
                curveToRelative(-0.55f, 0.55f, -0.81f, 1.28f, -0.81f, 2f)
                curveToRelative(0f, 1.69f, 0.92f, 3.57f, 2.43f, 5.3f)
                lineToRelative(-2.17f, 2.17f)
                curveToRelative(-1.41f, -1.73f, -2.26f, -3.93f, -2.26f, -6.32f)
                curveTo(2f, 6.49f, 6.49f, 2f, 12f, 2f)
                close()
                moveTo(12f, 22f)
                curveToRelative(-2.4f, 0f, -4.6f, -0.85f, -6.32f, -2.26f)
                lineTo(19.74f, 5.68f)
                curveToRelative(1.41f, 1.73f, 2.26f, 3.93f, 2.26f, 6.32f)
                curveToRelative(0f, 5.51f, -4.49f, 10f, -10f, 10f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(14.36f, 15.76f)
                curveToRelative(-0.45f, -0.45f, -1.17f, -0.45f, -1.62f, 0f)
                lineToRelative(-3.09f, 3.08f)
                curveToRelative(1.19f, 0.71f, 2.41f, 1.15f, 3.48f, 1.15f)
                curveToRelative(0.72f, 0f, 1.45f, -0.26f, 2f, -0.81f)
                lineToRelative(0.52f, -0.6f)
                curveToRelative(0.45f, -0.45f, 0.45f, -1.17f, 0f, -1.62f)
                lineToRelative(-1.3f, -1.21f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveTo(19.12f, 9.12f)
                lineToRelative(-1.53f, 1.53f)
                curveToRelative(0.26f, 0.74f, 0.41f, 1.53f, 0.41f, 2.35f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                curveToRelative(0f, -1.37f, -0.31f, -2.68f, -0.88f, -3.88f)
                close()
            }
        }.also { _CallForbidden = it}
