package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _InboxOut: ImageVector? = null

val Icons.Rr.InboxOut: ImageVector
    get() = _InboxOut ?: UXIcon(name = "InboxOut") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(21f, 12f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.1f, 0f, -2f, 0.9f, -2f, 2f)
                reflectiveCurveToRelative(-0.9f, 2f, -2f, 2f)
                horizontalLineToRelative(-4f)
                curveToRelative(-1.1f, 0f, -2f, -0.9f, -2f, -2f)
                reflectiveCurveToRelative(-0.9f, -2f, -2f, -2f)
                lineTo(3f, 12f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 2.76f, 2.24f, 5f, 5f, 5f)
                horizontalLineToRelative(14f)
                curveToRelative(2.76f, 0f, 5f, -2.24f, 5f, -5f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(22f, 19f)
                curveToRelative(0f, 1.65f, -1.35f, 3f, -3f, 3f)
                lineTo(5f, 22f)
                curveToRelative(-1.65f, 0f, -3f, -1.35f, -3f, -3f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                lineToRelative(3f, -0.0f)
                verticalLineToRelative(0.0f)
                curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
                horizontalLineToRelative(4f)
                curveToRelative(2.21f, 0f, 4f, -1.79f, 4f, -4f)
                horizontalLineToRelative(3f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4f)
                close()
                moveTo(7.29f, 5.29f)
                curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0f, -1.41f)
                lineTo(10.59f, 0.59f)
                curveTo(10.97f, 0.2f, 11.48f, 0.01f, 11.99f, 0.0f)
                lineToRelative(0.01f, -0.0f)
                lineToRelative(0.01f, 0.0f)
                curveToRelative(0.51f, 0.0f, 1.01f, 0.2f, 1.4f, 0.58f)
                lineToRelative(3.29f, 3.29f)
                curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0f, 1.41f)
                curveToRelative(-0.2f, 0.2f, -0.45f, 0.29f, -0.71f, 0.29f)
                reflectiveCurveToRelative(-0.51f, -0.1f, -0.71f, -0.29f)
                lineToRelative(-2.29f, -2.29f)
                verticalLineToRelative(7f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                reflectiveCurveToRelative(-1f, -0.45f, -1f, -1f)
                lineTo(11f, 3f)
                lineToRelative(-2.29f, 2.29f)
                curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0f)
                close()
            }
        }.also { _InboxOut = it}
