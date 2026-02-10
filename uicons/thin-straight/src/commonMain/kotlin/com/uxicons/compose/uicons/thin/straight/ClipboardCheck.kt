package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClipboardCheck: ImageVector? = null

val Icons.Ts.ClipboardCheck: ImageVector
    get() = _ClipboardCheck ?: UXIcon(name = "ClipboardCheck") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(15.95f, 2f)
                curveToRelative(-0.23f, -1.14f, -1.24f, -2f, -2.45f, -2f)
                horizontalLineToRelative(-3f)
                curveToRelative(-1.21f, 0f, -2.22f, 0.86f, -2.45f, 2f)
                lineTo(3f, 2f)
                verticalLineToRelative(19.5f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                horizontalLineToRelative(13f)
                curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
                lineTo(21f, 2f)
                horizontalLineToRelative(-5.05f)
                close()
                moveTo(20f, 21.5f)
                curveToRelative(0f, 0.83f, -0.67f, 1.5f, -1.5f, 1.5f)
                lineTo(5.5f, 23f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                lineTo(4f, 3f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(3f)
                curveToRelative(0.83f, 0f, 1.5f, 0.67f, 1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(18.5f)
                close()
                moveTo(10.98f, 14.79f)
                lineToRelative(5.9f, -5.8f)
                lineToRelative(0.7f, 0.71f)
                lineToRelative(-5.9f, 5.79f)
                curveToRelative(-0.34f, 0.34f, -0.78f, 0.5f, -1.22f, 0.5f)
                reflectiveCurveToRelative(-0.89f, -0.17f, -1.23f, -0.51f)
                lineToRelative(-2.81f, -2.71f)
                lineToRelative(0.69f, -0.72f)
                lineToRelative(2.82f, 2.72f)
                curveToRelative(0.29f, 0.29f, 0.76f, 0.29f, 1.04f, 0.01f)
                close()
            }
        }.also { _ClipboardCheck = it}
