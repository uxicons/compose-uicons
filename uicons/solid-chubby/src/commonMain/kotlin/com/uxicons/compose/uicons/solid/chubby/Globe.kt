package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Globe: ImageVector? = null

val Icons.Sc.Globe: ImageVector
    get() = _Globe ?: UXIcon(name = "Globe") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0.5f)
                curveTo(7.06f, 0.5f, 0.5f, 1.69f, 0.5f, 12f)
                reflectiveCurveToRelative(6.56f, 11.5f, 11.5f, 11.5f)
                reflectiveCurveToRelative(11.5f, -1.19f, 11.5f, -11.5f)
                reflectiveCurveTo(16.94f, 0.5f, 12f, 0.5f)
                close()
                moveTo(12.13f, 20.5f)
                curveToRelative(-0.04f, 0f, -0.22f, 0f, -0.27f, 0f)
                curveToRelative(-0.82f, -0.01f, -2.17f, -0.2f, -2.77f, -3.88f)
                horizontalLineToRelative(5.82f)
                curveToRelative(-0.6f, 3.67f, -1.95f, 3.87f, -2.77f, 3.88f)
                close()
                moveTo(8.82f, 13.62f)
                curveToRelative(-0.02f, -0.5f, -0.03f, -1.04f, -0.03f, -1.62f)
                reflectiveCurveToRelative(0.01f, -1.12f, 0.03f, -1.62f)
                horizontalLineToRelative(6.37f)
                curveToRelative(0.02f, 0.5f, 0.03f, 1.04f, 0.03f, 1.62f)
                reflectiveCurveToRelative(-0.01f, 1.12f, -0.03f, 1.62f)
                horizontalLineToRelative(-6.37f)
                close()
                moveTo(3.5f, 12f)
                curveToRelative(0f, -0.58f, 0.02f, -1.12f, 0.07f, -1.62f)
                horizontalLineToRelative(2.25f)
                curveToRelative(-0.02f, 0.54f, -0.03f, 1.09f, -0.03f, 1.62f)
                reflectiveCurveToRelative(0.01f, 1.08f, 0.03f, 1.62f)
                lineTo(3.56f, 13.62f)
                curveToRelative(-0.04f, -0.5f, -0.07f, -1.04f, -0.07f, -1.62f)
                close()
                moveTo(11.87f, 3.5f)
                curveToRelative(0.04f, 0f, 0.22f, 0f, 0.27f, 0f)
                curveToRelative(0.82f, 0.01f, 2.17f, 0.2f, 2.77f, 3.88f)
                horizontalLineToRelative(-5.82f)
                curveToRelative(0.6f, -3.67f, 1.95f, -3.87f, 2.77f, -3.88f)
                close()
                moveTo(18.19f, 10.38f)
                horizontalLineToRelative(2.25f)
                curveToRelative(0.04f, 0.5f, 0.07f, 1.04f, 0.07f, 1.62f)
                reflectiveCurveToRelative(-0.02f, 1.12f, -0.07f, 1.62f)
                horizontalLineToRelative(-2.25f)
                curveToRelative(0.02f, -0.54f, 0.03f, -1.09f, 0.03f, -1.62f)
                reflectiveCurveToRelative(-0.01f, -1.08f, -0.03f, -1.62f)
                close()
                moveTo(19.8f, 7.38f)
                horizontalLineToRelative(-1.85f)
                curveToRelative(-0.15f, -1.04f, -0.37f, -2.04f, -0.69f, -2.93f)
                curveToRelative(1.13f, 0.59f, 2.0f, 1.52f, 2.55f, 2.93f)
                close()
                moveTo(6.75f, 4.45f)
                curveToRelative(-0.33f, 0.89f, -0.55f, 1.89f, -0.69f, 2.93f)
                horizontalLineToRelative(-1.85f)
                curveToRelative(0.55f, -1.41f, 1.42f, -2.34f, 2.55f, -2.93f)
                close()
                moveTo(4.2f, 16.62f)
                horizontalLineToRelative(1.85f)
                curveToRelative(0.15f, 1.04f, 0.37f, 2.04f, 0.69f, 2.93f)
                curveToRelative(-1.13f, -0.59f, -2.0f, -1.52f, -2.55f, -2.93f)
                close()
                moveTo(17.25f, 19.55f)
                curveToRelative(0.33f, -0.89f, 0.55f, -1.89f, 0.69f, -2.93f)
                horizontalLineToRelative(1.85f)
                curveToRelative(-0.55f, 1.41f, -1.42f, 2.34f, -2.55f, 2.93f)
                close()
            }
        }.also { _Globe = it}
