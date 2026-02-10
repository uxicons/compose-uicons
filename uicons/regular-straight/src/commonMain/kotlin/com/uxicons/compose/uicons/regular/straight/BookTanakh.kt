package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookTanakh: ImageVector? = null

val Icons.Rs.BookTanakh: ImageVector
    get() = _BookTanakh ?: UXIcon(name = "BookTanakh") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19.04f, 0f)
                lineTo(4.04f, 0f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                verticalLineToRelative(22f)
                horizontalLineToRelative(17f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                lineTo(22.04f, 3f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(19.04f, 2f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(15.18f)
                curveToRelative(-0.31f, -0.11f, -0.65f, -0.18f, -1f, -0.18f)
                lineTo(4.04f, 18f)
                lineTo(4.04f, 2f)
                horizontalLineToRelative(15f)
                close()
                moveTo(19.04f, 22f)
                lineTo(4.04f, 22f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(15f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                close()
            }
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(7.76f, 9.99f)
                lineToRelative(-2.13f, 3.5f)
                horizontalLineToRelative(4.27f)
                lineToRelative(2.11f, 3.46f)
                lineToRelative(2.11f, -3.46f)
                horizontalLineToRelative(4.27f)
                lineToRelative(-2.13f, -3.5f)
                lineToRelative(2.13f, -3.5f)
                horizontalLineToRelative(-4.26f)
                lineToRelative(-2.11f, -3.47f)
                lineToRelative(-2.11f, 3.47f)
                horizontalLineToRelative(-4.26f)
                lineToRelative(2.13f, 3.5f)
                close()
                moveTo(7.41f, 12.49f)
                lineToRelative(0.94f, -1.54f)
                lineToRelative(0.94f, 1.54f)
                horizontalLineToRelative(-1.88f)
                close()
                moveTo(8.93f, 9.99f)
                lineToRelative(1.52f, -2.5f)
                horizontalLineToRelative(3.1f)
                lineToRelative(1.52f, 2.5f)
                lineToRelative(-1.53f, 2.5f)
                horizontalLineToRelative(-3.09f)
                lineToRelative(-1.53f, -2.5f)
                close()
                moveTo(12.0f, 15.03f)
                lineToRelative(-0.94f, -1.53f)
                horizontalLineToRelative(1.87f)
                lineToRelative(-0.94f, 1.53f)
                close()
                moveTo(16.6f, 12.49f)
                horizontalLineToRelative(-1.88f)
                lineToRelative(0.94f, -1.54f)
                lineToRelative(0.94f, 1.54f)
                close()
                moveTo(16.6f, 7.5f)
                lineToRelative(-0.94f, 1.54f)
                lineToRelative(-0.94f, -1.54f)
                horizontalLineToRelative(1.87f)
                close()
                moveTo(12.0f, 4.95f)
                lineToRelative(0.94f, 1.54f)
                horizontalLineToRelative(-1.88f)
                lineToRelative(0.94f, -1.54f)
                close()
                moveTo(8.35f, 9.03f)
                lineToRelative(-0.94f, -1.54f)
                horizontalLineToRelative(1.87f)
                lineToRelative(-0.94f, 1.54f)
                close()
            }
        }.also { _BookTanakh = it}
