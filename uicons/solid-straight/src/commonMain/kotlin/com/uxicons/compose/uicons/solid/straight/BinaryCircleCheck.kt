package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BinaryCircleCheck: ImageVector? = null

val Icons.Ss.BinaryCircleCheck: ImageVector
    get() = _BinaryCircleCheck ?: UXIcon(name = "BinaryCircleCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17f, 10f)
                curveToRelative(-3.86f, 0f, -7f, 3.14f, -7f, 7f)
                reflectiveCurveToRelative(3.14f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -3.14f, 7f, -7f)
                reflectiveCurveToRelative(-3.14f, -7f, -7f, -7f)
                close()
                moveTo(17.87f, 19.46f)
                curveToRelative(-0.36f, 0.36f, -0.83f, 0.55f, -1.33f, 0.55f)
                curveToRelative(-0.01f, 0f, -0.02f, 0f, -0.03f, 0f)
                curveToRelative(-0.51f, 0f, -0.99f, -0.22f, -1.34f, -0.6f)
                lineToRelative(-1.99f, -2.08f)
                lineToRelative(1.44f, -1.39f)
                lineToRelative(1.93f, 2.02f)
                lineToRelative(3.22f, -3.22f)
                lineToRelative(1.41f, 1.41f)
                lineToRelative(-3.3f, 3.3f)
                close()
                moveTo(4f, 11f)
                curveTo(1.79f, 11f, 0f, 9.21f, 0f, 7f)
                verticalLineToRelative(-3f)
                curveTo(0f, 1.79f, 1.79f, 0f, 4f, 0f)
                reflectiveCurveToRelative(4f, 1.79f, 4f, 4f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
                close()
                moveTo(4f, 2f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.1f, 0.9f, 2f, 2f, 2f)
                reflectiveCurveToRelative(2f, -0.9f, 2f, -2f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                close()
                moveTo(5f, 24f)
                lineTo(3f, 24f)
                verticalLineToRelative(-7.63f)
                lineToRelative(-1.58f, 1.63f)
                lineTo(-0.02f, 16.6f)
                lineToRelative(3.51f, -3.6f)
                horizontalLineToRelative(1.42f)
                lineToRelative(0.09f, 1f)
                verticalLineToRelative(10f)
                close()
                moveTo(11.42f, 5f)
                lineToRelative(-1.43f, -1.4f)
                lineTo(13.49f, 0f)
                horizontalLineToRelative(1.42f)
                lineToRelative(0.09f, 1f)
                verticalLineToRelative(7.23f)
                curveToRelative(-0.7f, 0.16f, -1.37f, 0.4f, -2f, 0.72f)
                lineTo(13f, 3.37f)
                lineToRelative(-1.58f, 1.63f)
                close()
            }
        }.also { _BinaryCircleCheck = it}
