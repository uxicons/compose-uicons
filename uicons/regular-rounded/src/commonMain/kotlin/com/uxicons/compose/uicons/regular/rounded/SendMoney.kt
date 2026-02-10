package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SendMoney: ImageVector? = null

val Icons.Rr.SendMoney: ImageVector
    get() = _SendMoney ?: UXIcon(name = "SendMoney") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(24f, 12f)
                curveToRelative(0f, 6.62f, -5.38f, 12f, -12f, 12f)
                reflectiveCurveTo(0f, 18.62f, 0f, 12f)
                reflectiveCurveTo(5.38f, 0f, 12f, 0f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                curveTo(6.49f, 2f, 2f, 6.49f, 2f, 12f)
                reflectiveCurveToRelative(4.49f, 10f, 10f, 10f)
                reflectiveCurveToRelative(10f, -4.49f, 10f, -10f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                close()
                moveTo(22f, 0f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(2.59f)
                lineToRelative(-3.29f, 3.29f)
                curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(0.2f, 0.2f, 0.45f, 0.29f, 0.71f, 0.29f)
                reflectiveCurveToRelative(0.51f, -0.1f, 0.71f, -0.29f)
                lineToRelative(3.29f, -3.29f)
                verticalLineToRelative(2.59f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                lineTo(24f, 2f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(13f, 6f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveToRelative(-1f, 0.45f, -1f, 1f)
                verticalLineToRelative(1f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                curveToRelative(0f, 1.36f, 0.97f, 2.51f, 2.31f, 2.73f)
                lineToRelative(3.04f, 0.51f)
                curveToRelative(0.37f, 0.06f, 0.65f, 0.38f, 0.65f, 0.76f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-2.27f)
                curveToRelative(-0.36f, 0f, -0.69f, -0.19f, -0.87f, -0.5f)
                curveToRelative(-0.28f, -0.48f, -0.89f, -0.64f, -1.37f, -0.36f)
                curveToRelative(-0.48f, 0.28f, -0.64f, 0.89f, -0.36f, 1.37f)
                curveToRelative(0.53f, 0.93f, 1.53f, 1.5f, 2.6f, 1.5f)
                horizontalLineToRelative(0.27f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-1f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                curveToRelative(0f, -1.36f, -0.97f, -2.51f, -2.31f, -2.73f)
                lineToRelative(-3.04f, -0.51f)
                curveToRelative(-0.37f, -0.06f, -0.65f, -0.38f, -0.65f, -0.76f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(2.27f)
                curveToRelative(0.36f, 0f, 0.69f, 0.19f, 0.87f, 0.5f)
                curveToRelative(0.28f, 0.48f, 0.89f, 0.64f, 1.37f, 0.36f)
                curveToRelative(0.48f, -0.28f, 0.64f, -0.89f, 0.36f, -1.37f)
                curveToRelative(-0.53f, -0.93f, -1.53f, -1.5f, -2.6f, -1.5f)
                horizontalLineToRelative(-0.27f)
                verticalLineToRelative(-1f)
                close()
            }
        }.also { _SendMoney = it}
