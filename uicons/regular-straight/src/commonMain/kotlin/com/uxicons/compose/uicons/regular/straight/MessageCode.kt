package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageCode: ImageVector? = null

val Icons.Rs.MessageCode: ImageVector
    get() = _MessageCode ?: UXIcon(name = "MessageCode") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.12f, 14.71f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(3.3f, -3.3f)
                lineToRelative(-3.3f, -3.28f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(3.3f, 3.3f)
                curveToRelative(0.38f, 0.38f, 0.58f, 0.87f, 0.58f, 1.41f)
                reflectiveCurveToRelative(-0.21f, 1.03f, -0.58f, 1.41f)
                lineToRelative(-3.3f, 3.3f)
                close()
                moveTo(10.29f, 13.29f)
                lineToRelative(-3.3f, -3.28f)
                lineToRelative(3.3f, -3.3f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-3.3f, 3.3f)
                curveToRelative(-0.38f, 0.38f, -0.58f, 0.88f, -0.58f, 1.41f)
                reflectiveCurveToRelative(0.21f, 1.03f, 0.58f, 1.41f)
                lineToRelative(3.3f, 3.3f)
                lineToRelative(1.41f, -1.41f)
                close()
                moveTo(13.3f, 23.18f)
                lineToRelative(3.85f, -3.18f)
                horizontalLineToRelative(6.85f)
                lineTo(24.0f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(3f, 0f)
                curveTo(1.35f, 0f, 0f, 1.35f, 0f, 3f)
                lineTo(0f, 20f)
                lineTo(6.92f, 20f)
                lineToRelative(3.75f, 3.16f)
                curveToRelative(0.38f, 0.34f, 0.86f, 0.51f, 1.34f, 0.51f)
                curveToRelative(0.47f, 0f, 0.93f, -0.16f, 1.29f, -0.48f)
                close()
                moveTo(2f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                lineTo(21f, 2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(-5.57f)
                lineToRelative(-4.45f, 3.65f)
                lineToRelative(-4.33f, -3.65f)
                lineTo(2f, 18f)
                lineTo(2f, 3f)
                close()
            }
        }.also { _MessageCode = it}
