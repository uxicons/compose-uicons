package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InboxFull: ImageVector? = null

val Icons.Rs.InboxFull: ImageVector
    get() = _InboxFull ?: UXIcon(name = "InboxFull") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(21.72f, 0f)
                horizontalLineToRelative(-2.05f)
                lineToRelative(2.21f, 12f)
                horizontalLineToRelative(-5.88f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 1.1f, -0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                verticalLineToRelative(-2f)
                lineTo(2.12f, 12f)
                lineTo(4.34f, 0f)
                horizontalLineToRelative(-2.05f)
                lineTo(0f, 12.23f)
                lineToRelative(0.01f, 8.77f)
                curveToRelative(-0.0f, 0.8f, 0.31f, 1.56f, 0.88f, 2.13f)
                reflectiveCurveToRelative(1.32f, 0.88f, 2.12f, 0.88f)
                horizontalLineToRelative(18.0f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-8.5f)
                lineTo(21.72f, 0f)
                close()
                moveTo(22f, 21f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(3.0f, 22f)
                curveToRelative(-0.27f, 0f, -0.52f, -0.1f, -0.71f, -0.29f)
                reflectiveCurveToRelative(-0.29f, -0.44f, -0.29f, -0.71f)
                lineToRelative(-0.0f, -7.0f)
                horizontalLineToRelative(4.0f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(4f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(7f)
                close()
                moveTo(18.01f, 2f)
                lineTo(6.0f, 2f)
                lineToRelative(0.37f, -2f)
                horizontalLineToRelative(11.27f)
                lineToRelative(0.37f, 2f)
                close()
                moveTo(19.48f, 10f)
                lineTo(4.52f, 10f)
                lineToRelative(0.37f, -2f)
                horizontalLineToRelative(14.22f)
                lineToRelative(0.37f, 2f)
                close()
                moveTo(18.75f, 6f)
                lineTo(5.26f, 6f)
                lineToRelative(0.37f, -2f)
                horizontalLineToRelative(12.74f)
                lineToRelative(0.37f, 2f)
                close()
            }
        }.also { _InboxFull = it}
