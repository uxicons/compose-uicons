package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BoxCheck: ImageVector? = null

val Icons.Rs.BoxCheck: ImageVector
    get() = _BoxCheck ?: UXIcon(name = "BoxCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(6.11f, 15.53f)
                lineToRelative(1.39f, -1.44f)
                lineToRelative(2.98f, 2.9f)
                lineToRelative(5.81f, -5.7f)
                lineToRelative(1.4f, 1.42f)
                lineToRelative(-5.79f, 5.71f)
                curveToRelative(-0.39f, 0.39f, -0.9f, 0.58f, -1.41f, 0.58f)
                reflectiveCurveToRelative(-1.02f, -0.2f, -1.42f, -0.59f)
                lineToRelative(-2.97f, -2.89f)
                close()
                moveTo(24f, 9f)
                horizontalLineToRelative(-1f)
                verticalLineToRelative(15f)
                lineTo(1f, 24f)
                lineTo(1f, 9f)
                lineTo(0f, 9f)
                lineTo(0f, 3f)
                curveTo(0f, 1.35f, 1.35f, 0f, 3f, 0f)
                lineTo(21f, 0f)
                curveToRelative(1.65f, 0f, 3f, 1.35f, 3f, 3f)
                verticalLineToRelative(6f)
                close()
                moveTo(2f, 7f)
                lineTo(22f, 7f)
                lineTo(22f, 3f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                lineTo(3f, 2f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                lineTo(2f, 7f)
                close()
                moveTo(21f, 9f)
                lineTo(3f, 9f)
                verticalLineToRelative(13f)
                lineTo(21f, 22f)
                lineTo(21f, 9f)
                close()
            }
        }.also { _BoxCheck = it}
