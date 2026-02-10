package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _RectangleCode: ImageVector? = null

val Icons.Rs.RectangleCode: ImageVector
    get() = _RectangleCode ?: UXIcon(name = "RectangleCode") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(15.12f, 16.7f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(3.3f, -3.3f)
                lineToRelative(-3.3f, -3.28f)
                lineToRelative(1.41f, -1.41f)
                lineToRelative(3.3f, 3.3f)
                curveToRelative(0.38f, 0.38f, 0.58f, 0.88f, 0.58f, 1.41f)
                reflectiveCurveToRelative(-0.21f, 1.03f, -0.58f, 1.41f)
                lineToRelative(-3.3f, 3.3f)
                close()
                moveTo(10.29f, 15.29f)
                lineToRelative(-3.3f, -3.28f)
                lineToRelative(3.3f, -3.3f)
                lineToRelative(-1.41f, -1.41f)
                lineToRelative(-3.3f, 3.3f)
                curveToRelative(-0.78f, 0.78f, -0.78f, 2.04f, 0f, 2.81f)
                lineToRelative(3.3f, 3.3f)
                lineToRelative(1.41f, -1.41f)
                close()
                moveTo(24f, 5f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                lineTo(3f, 2f)
                curveTo(1.35f, 2f, 0f, 3.35f, 0f, 5f)
                lineTo(0f, 22f)
                lineTo(24f, 22f)
                lineTo(24f, 5f)
                close()
                moveTo(2f, 5f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                lineTo(21f, 4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(15f)
                lineTo(2f, 20f)
                lineTo(2f, 5f)
                close()
            }
        }.also { _RectangleCode = it}
