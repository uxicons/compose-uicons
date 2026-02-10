package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MessageStar: ImageVector? = null

val Icons.Bs.MessageStar: ImageVector
    get() = _MessageStar ?: UXIcon(name = "MessageStar") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(12f, 0f)
                curveTo(5.38f, 0f, 0f, 5.38f, 0f, 12f)
                reflectiveCurveToRelative(5.38f, 12f, 12f, 12f)
                horizontalLineToRelative(12f)
                lineTo(24f, 12f)
                curveTo(24f, 5.38f, 18.62f, 0f, 12f, 0f)
                close()
                moveTo(21f, 21f)
                lineTo(12f, 21f)
                curveToRelative(-4.96f, 0f, -9f, -4.04f, -9f, -9f)
                reflectiveCurveTo(7.04f, 3f, 12f, 3f)
                reflectiveCurveToRelative(9f, 4.04f, 9f, 9f)
                verticalLineToRelative(9f)
                close()
                moveTo(13.68f, 10f)
                horizontalLineToRelative(3.83f)
                verticalLineToRelative(0.92f)
                lineToRelative(-2.8f, 1.91f)
                lineToRelative(1.17f, 3.65f)
                lineToRelative(-0.75f, 0.52f)
                lineToRelative(-3.1f, -2.14f)
                lineToRelative(-3.05f, 2.14f)
                horizontalLineToRelative(-0.02f)
                lineToRelative(-0.72f, -0.54f)
                lineToRelative(1.08f, -3.69f)
                lineToRelative(-2.82f, -1.85f)
                verticalLineToRelative(-0.92f)
                horizontalLineToRelative(3.85f)
                lineToRelative(1.18f, -4f)
                horizontalLineToRelative(0.97f)
                lineToRelative(1.18f, 4f)
                close()
            }
        }.also { _MessageStar = it}
