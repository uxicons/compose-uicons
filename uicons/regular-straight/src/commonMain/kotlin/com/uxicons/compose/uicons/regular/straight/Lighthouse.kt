package com.uxicons.compose.uicons.regular.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Lighthouse: ImageVector? = null

val Icons.Rs.Lighthouse: ImageVector
    get() = _Lighthouse ?: UXIcon(name = "Lighthouse") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(17f, 2.5f)
                lineTo(12f, 0f)
                lineToRelative(-5f, 2.5f)
                verticalLineToRelative(5.42f)
                lineToRelative(-1.99f, 12.92f)
                lineToRelative(-0.01f, 3.15f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(-3f)
                lineToRelative(-2f, -13.08f)
                lineTo(17f, 2.5f)
                close()
                moveTo(15f, 4f)
                verticalLineToRelative(3f)
                horizontalLineToRelative(-6.01f)
                lineToRelative(0.01f, -3f)
                horizontalLineToRelative(6.0f)
                close()
                moveTo(17f, 22f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                reflectiveCurveToRelative(-3f, 1.35f, -3f, 3f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-0.92f)
                lineToRelative(1.86f, -12.08f)
                horizontalLineToRelative(6.29f)
                lineToRelative(1.85f, 12.08f)
                verticalLineToRelative(0.92f)
                close()
                moveTo(5f, 4.5f)
                lineTo(0f, 2.62f)
                lineTo(0f, 0.49f)
                lineToRelative(5f, 1.88f)
                verticalLineToRelative(2.14f)
                close()
                moveTo(5f, 8.64f)
                lineToRelative(-5f, 1.88f)
                verticalLineToRelative(-2.14f)
                lineToRelative(5f, -1.88f)
                verticalLineToRelative(2.14f)
                close()
                moveTo(24f, 0.49f)
                verticalLineToRelative(2.14f)
                lineToRelative(-5f, 1.88f)
                verticalLineToRelative(-2.14f)
                lineToRelative(5f, -1.88f)
                close()
                moveTo(19f, 6.5f)
                lineToRelative(5f, 1.88f)
                verticalLineToRelative(2.14f)
                lineToRelative(-5f, -1.88f)
                verticalLineToRelative(-2.14f)
                close()
            }
        }.also { _Lighthouse = it}
