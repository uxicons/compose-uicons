package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoxCheck: ImageVector? = null

val Icons.Sr.BoxCheck: ImageVector
    get() = _BoxCheck ?: UXIcon(name = "BoxCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(5.0f, 0.01f)
                curveTo(2.24f, 0.01f, 0f, 2.24f, 0f, 5.0f)
                lineTo(0f, 5.0f)
                curveTo(0f, 6.66f, 1.34f, 8.0f, 3.0f, 8.0f)
                lineTo(21.0f, 8.0f)
                curveToRelative(1.58f, 0.02f, 2.9f, -1.2f, 3.0f, -2.78f)
                curveTo(24.12f, 2.47f, 21.98f, 0.13f, 19.21f, 0.01f)
                curveToRelative(-0.07f, -0.0f, -14.21f, -0.01f, -14.21f, -0.01f)
                close()
                moveTo(22.0f, 10.0f)
                lineTo(2f, 10.0f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                verticalLineToRelative(8.0f)
                curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f)
                horizontalLineToRelative(12.0f)
                curveToRelative(2.76f, -0.0f, 5.0f, -2.24f, 5.0f, -5.0f)
                verticalLineToRelative(-8.0f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
                moveTo(17.68f, 14.73f)
                lineToRelative(-4.74f, 4.41f)
                curveToRelative(-0.54f, 0.54f, -1.29f, 0.85f, -2.1f, 0.85f)
                reflectiveCurveToRelative(-1.55f, -0.31f, -2.12f, -0.88f)
                lineToRelative(-2.43f, -2.41f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, -0.01f, -1.41f)
                curveToRelative(0.39f, -0.39f, 1.02f, -0.4f, 1.42f, -0.01f)
                lineToRelative(2.43f, 2.41f)
                curveToRelative(0.38f, 0.39f, 1.04f, 0.38f, 1.42f, 0.0f)
                lineToRelative(4.77f, -4.44f)
                curveToRelative(0.4f, -0.38f, 1.04f, -0.35f, 1.41f, 0.05f)
                curveToRelative(0.38f, 0.4f, 0.35f, 1.04f, -0.05f, 1.41f)
                close()
            }
        }.also { _BoxCheck = it}
