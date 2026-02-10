package com.uxicons.compose.uicons.solid.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CalendarCheck: ImageVector? = null

val Icons.Sr.CalendarCheck: ImageVector
    get() = _CalendarCheck ?: UXIcon(name = "CalendarCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(0f, 8f)
                verticalLineToRelative(-1f)
                curveTo(0f, 4.24f, 2.24f, 2f, 5f, 2f)
                horizontalLineToRelative(1f)
                lineTo(6f, 1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(8f)
                lineTo(16f, 1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(1f)
                curveToRelative(2.76f, 0f, 5f, 2.24f, 5f, 5f)
                verticalLineToRelative(1f)
                lineTo(0f, 8f)
                close()
                moveTo(24f, 10f)
                verticalLineToRelative(9f)
                curveToRelative(0f, 2.76f, -2.24f, 5f, -5f, 5f)
                lineTo(5f, 24f)
                curveToRelative(-2.76f, 0f, -5f, -2.24f, -5f, -5f)
                lineTo(0f, 10f)
                lineTo(24f, 10f)
                close()
                moveTo(17.83f, 13.15f)
                curveToRelative(-0.38f, -0.4f, -1.02f, -0.41f, -1.41f, -0.03f)
                lineToRelative(-4.75f, 4.58f)
                curveToRelative(-0.38f, 0.38f, -1.01f, 0.4f, -1.44f, -0.03f)
                lineToRelative(-2.28f, -2.12f)
                curveToRelative(-0.4f, -0.38f, -1.03f, -0.35f, -1.41f, 0.05f)
                curveToRelative(-0.38f, 0.4f, -0.35f, 1.04f, 0.05f, 1.41f)
                lineToRelative(2.25f, 2.09f)
                curveToRelative(0.57f, 0.57f, 1.32f, 0.88f, 2.12f, 0.88f)
                reflectiveCurveToRelative(1.56f, -0.31f, 2.11f, -0.87f)
                lineToRelative(4.74f, -4.57f)
                curveToRelative(0.4f, -0.38f, 0.41f, -1.02f, 0.03f, -1.41f)
                close()
            }
        }.also { _CalendarCheck = it}
