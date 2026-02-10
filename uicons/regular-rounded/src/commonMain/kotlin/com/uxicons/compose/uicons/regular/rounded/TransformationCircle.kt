package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _TransformationCircle: ImageVector? = null

val Icons.Rr.TransformationCircle: ImageVector
    get() = _TransformationCircle ?: UXIcon(name = "TransformationCircle") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(18.0f, 5f)
                horizontalLineToRelative(-3.26f)
                curveToRelative(-0.65f, 0f, -0.98f, 0.79f, -0.52f, 1.25f)
                lineToRelative(1.06f, 1.06f)
                lineToRelative(-1.52f, 1.52f)
                curveToRelative(-1.45f, -1.14f, -3.27f, -1.83f, -5.25f, -1.83f)
                curveTo(3.81f, 7f, 0f, 10.81f, 0f, 15.5f)
                reflectiveCurveToRelative(3.81f, 8.5f, 8.5f, 8.5f)
                reflectiveCurveToRelative(8.5f, -3.81f, 8.5f, -8.5f)
                curveToRelative(0f, -1.98f, -0.69f, -3.81f, -1.83f, -5.25f)
                lineToRelative(1.52f, -1.52f)
                lineToRelative(1.06f, 1.06f)
                curveToRelative(0.46f, 0.46f, 1.25f, 0.13f, 1.25f, -0.52f)
                verticalLineToRelative(-3.26f)
                curveToRelative(0f, -0.56f, -0.45f, -1.0f, -1.0f, -1.0f)
                close()
                moveTo(8.5f, 22f)
                curveToRelative(-3.58f, 0f, -6.5f, -2.92f, -6.5f, -6.5f)
                reflectiveCurveToRelative(2.92f, -6.5f, 6.5f, -6.5f)
                reflectiveCurveToRelative(6.5f, 2.92f, 6.5f, 6.5f)
                reflectiveCurveToRelative(-2.92f, 6.5f, -6.5f, 6.5f)
                close()
                moveTo(24f, 8.5f)
                curveToRelative(0f, 2.7f, -1.24f, 5.18f, -3.4f, 6.8f)
                curveToRelative(-0.18f, 0.14f, -0.39f, 0.2f, -0.6f, 0.2f)
                curveToRelative(-0.3f, 0f, -0.6f, -0.14f, -0.8f, -0.4f)
                curveToRelative(-0.33f, -0.44f, -0.24f, -1.07f, 0.2f, -1.4f)
                curveToRelative(1.65f, -1.24f, 2.6f, -3.14f, 2.6f, -5.2f)
                curveToRelative(0f, -3.58f, -2.92f, -6.5f, -6.5f, -6.5f)
                curveToRelative(-2.06f, 0f, -3.96f, 0.95f, -5.2f, 2.6f)
                curveToRelative(-0.33f, 0.44f, -0.96f, 0.53f, -1.4f, 0.2f)
                curveToRelative(-0.44f, -0.33f, -0.53f, -0.96f, -0.2f, -1.4f)
                curveToRelative(1.62f, -2.16f, 4.1f, -3.4f, 6.8f, -3.4f)
                curveToRelative(4.69f, 0f, 8.5f, 3.81f, 8.5f, 8.5f)
                close()
            }
        }.also { _TransformationCircle = it}
