package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _YogaPosture: ImageVector? = null

val Icons.Sr.YogaPosture: ImageVector
    get() = _YogaPosture ?: UXIcon(name = "YogaPosture") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.0f, 15.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                reflectiveCurveToRelative(-2.5f, -1.12f, -2.5f, -2.5f)
                reflectiveCurveToRelative(1.12f, -2.5f, 2.5f, -2.5f)
                reflectiveCurveToRelative(2.5f, 1.12f, 2.5f, 2.5f)
                close()
                moveTo(18f, 14.56f)
                lineToRelative(-0.02f, 7.44f)
                curveToRelative(-0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.55f, -0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                lineToRelative(0.02f, -12.0f)
                curveToRelative(0f, -2.04f, -1.49f, -3.28f, -3.51f, -3.5f)
                curveToRelative(-0.5f, 1f, -1.4f, 2.05f, -2.87f, 2.37f)
                curveToRelative(-0.37f, 0.62f, -0.57f, 1.31f, -0.57f, 2.04f)
                lineToRelative(-0.02f, 11.09f)
                curveToRelative(-0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.55f, -0.0f, -1.0f, -0.45f, -1.0f, -1.0f)
                lineToRelative(0.02f, -11.09f)
                curveToRelative(0f, -0.79f, 0.17f, -1.54f, 0.46f, -2.26f)
                lineToRelative(-1.99f, -0.84f)
                curveToRelative(-0.32f, 0.96f, -0.5f, 2.03f, -0.5f, 3.19f)
                verticalLineToRelative(11f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                lineTo(3.03f, 11f)
                curveTo(3.03f, 4.5f, 6.72f, 1f, 12f, 1f)
                curveToRelative(4.89f, 0f, 9f, 3.95f, 9f, 8f)
                curveToRelative(0f, 3.5f, -1.88f, 4.84f, -3.0f, 5.56f)
                close()
            }
        }.also { _YogaPosture = it}
