package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BinaryCircleCheck: ImageVector? = null

val Icons.Rs.BinaryCircleCheck: ImageVector
    get() = _BinaryCircleCheck ?: UXIcon(name = "BinaryCircleCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.07f, 10f)
                curveToRelative(-3.86f, 0f, -7f, 3.14f, -7f, 7f)
                reflectiveCurveToRelative(3.14f, 7f, 7f, 7f)
                reflectiveCurveToRelative(7f, -3.14f, 7f, -7f)
                reflectiveCurveToRelative(-3.14f, -7f, -7f, -7f)
                close()
                moveTo(17.07f, 22f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                reflectiveCurveToRelative(2.24f, -5f, 5f, -5f)
                reflectiveCurveToRelative(5f, 2.24f, 5f, 5f)
                reflectiveCurveToRelative(-2.24f, 5f, -5f, 5f)
                close()
                moveTo(5.07f, 13f)
                verticalLineToRelative(11f)
                lineTo(3.07f, 24f)
                verticalLineToRelative(-7.63f)
                lineToRelative(-1.58f, 1.63f)
                lineTo(0.05f, 16.6f)
                lineToRelative(3.51f, -3.6f)
                horizontalLineToRelative(1.51f)
                close()
                moveTo(21.23f, 16.16f)
                lineToRelative(-3.3f, 3.3f)
                curveToRelative(-0.36f, 0.36f, -0.83f, 0.55f, -1.33f, 0.55f)
                curveToRelative(-0.01f, 0f, -0.02f, 0f, -0.03f, 0f)
                curveToRelative(-0.51f, 0f, -0.99f, -0.22f, -1.34f, -0.6f)
                lineToRelative(-1.99f, -2.08f)
                lineToRelative(1.44f, -1.39f)
                lineToRelative(1.93f, 2.02f)
                lineToRelative(3.22f, -3.22f)
                lineToRelative(1.41f, 1.41f)
                close()
                moveTo(15.07f, 0f)
                lineTo(15.07f, 8.23f)
                curveToRelative(-0.7f, 0.16f, -1.37f, 0.4f, -2f, 0.72f)
                lineTo(13.07f, 3.37f)
                lineToRelative(-1.58f, 1.63f)
                lineToRelative(-1.43f, -1.4f)
                lineTo(13.56f, 0f)
                horizontalLineToRelative(1.51f)
                close()
                moveTo(4.07f, 0f)
                curveTo(1.86f, 0f, 0.07f, 1.79f, 0.07f, 4f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
                verticalLineToRelative(-3f)
                curveTo(8.07f, 1.79f, 6.28f, 0f, 4.07f, 0f)
                close()
                moveTo(6.07f, 7f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                reflectiveCurveToRelative(-2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -1.1f, 0.9f, -2f, 2f, -2f)
                reflectiveCurveToRelative(2f, 0.9f, 2f, 2f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _BinaryCircleCheck = it}
