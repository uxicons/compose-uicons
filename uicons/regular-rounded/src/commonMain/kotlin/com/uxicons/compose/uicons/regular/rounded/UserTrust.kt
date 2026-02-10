package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _UserTrust: ImageVector? = null

val Icons.Rr.UserTrust: ImageVector
    get() = _UserTrust ?: UXIcon(name = "UserTrust") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.5f, 24f)
                curveToRelative(-3.58f, 0f, -6.5f, -2.92f, -6.5f, -6.5f)
                reflectiveCurveToRelative(2.92f, -6.5f, 6.5f, -6.5f)
                reflectiveCurveToRelative(6.5f, 2.92f, 6.5f, 6.5f)
                reflectiveCurveToRelative(-2.92f, 6.5f, -6.5f, 6.5f)
                close()
                moveTo(17.5f, 13f)
                curveToRelative(-2.48f, 0f, -4.5f, 2.02f, -4.5f, 4.5f)
                reflectiveCurveToRelative(2.02f, 4.5f, 4.5f, 4.5f)
                reflectiveCurveToRelative(4.5f, -2.02f, 4.5f, -4.5f)
                reflectiveCurveToRelative(-2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(18.5f, 19.35f)
                lineToRelative(1.89f, -1.83f)
                curveToRelative(0.4f, -0.39f, 0.41f, -1.02f, 0.02f, -1.41f)
                curveToRelative(-0.39f, -0.4f, -1.02f, -0.41f, -1.41f, -0.02f)
                lineToRelative(-1.89f, 1.84f)
                curveToRelative(-0.1f, 0.1f, -0.26f, 0.1f, -0.36f, 0f)
                lineToRelative(-0.88f, -0.86f)
                curveToRelative(-0.4f, -0.39f, -1.03f, -0.38f, -1.41f, 0.02f)
                reflectiveCurveToRelative(-0.38f, 1.03f, 0.01f, 1.41f)
                lineToRelative(0.88f, 0.86f)
                curveToRelative(0.44f, 0.43f, 1.01f, 0.64f, 1.58f, 0.64f)
                reflectiveCurveToRelative(1.15f, -0.21f, 1.58f, -0.64f)
                close()
                moveTo(9f, 12f)
                curveToRelative(-3.31f, 0f, -6f, -2.69f, -6f, -6f)
                reflectiveCurveTo(5.69f, 0f, 9f, 0f)
                reflectiveCurveToRelative(6f, 2.69f, 6f, 6f)
                reflectiveCurveToRelative(-2.69f, 6f, -6f, 6f)
                close()
                moveTo(9f, 2f)
                curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
                reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
                close()
                moveTo(2f, 23f)
                curveToRelative(0f, -3.52f, 2.63f, -6.51f, 6.12f, -6.95f)
                curveToRelative(0.55f, -0.07f, 0.94f, -0.57f, 0.87f, -1.12f)
                reflectiveCurveToRelative(-0.57f, -0.93f, -1.12f, -0.87f)
                curveTo(3.39f, 14.63f, 0f, 18.47f, 0f, 23f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                close()
            }
        }.also { _UserTrust = it}
