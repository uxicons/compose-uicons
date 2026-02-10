package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Insert: ImageVector? = null

val Icons.Rr.Insert: ImageVector
    get() = _Insert ?: UXIcon(name = "Insert") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(6.3f, 13.21f)
                curveToRelative(-0.4f, -0.39f, -0.4f, -1.02f, -0.01f, -1.41f)
                curveToRelative(0.39f, -0.4f, 1.02f, -0.4f, 1.41f, -0.01f)
                lineToRelative(3.3f, 3.23f)
                lineTo(11.0f, 1f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                reflectiveCurveToRelative(1f, 0.45f, 1f, 1f)
                verticalLineToRelative(14.01f)
                lineToRelative(3.3f, -3.22f)
                curveToRelative(0.39f, -0.39f, 1.03f, -0.38f, 1.41f, 0.01f)
                curveToRelative(0.39f, 0.39f, 0.38f, 1.03f, -0.01f, 1.41f)
                lineToRelative(-4.29f, 4.21f)
                curveToRelative(-0.39f, 0.39f, -0.89f, 0.58f, -1.4f, 0.58f)
                curveToRelative(0f, 0f, -0.0f, 0f, -0.0f, 0f)
                curveToRelative(0f, 0f, 0f, 0f, 0f, 0f)
                curveToRelative(0f, 0f, -0.0f, 0f, -0.0f, 0f)
                curveToRelative(-0.51f, -0.0f, -1.02f, -0.2f, -1.41f, -0.59f)
                lineToRelative(-4.29f, -4.2f)
                close()
                moveTo(23f, 16f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-1.38f, 0f, -2.5f, 1.12f, -2.5f, 2.5f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                lineTo(7.5f, 22f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f)
                horizontalLineToRelative(-1.5f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                reflectiveCurveToRelative(0.45f, 1f, 1f, 1f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(1f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(9f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-1f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                reflectiveCurveToRelative(-0.45f, -1f, -1f, -1f)
                close()
            }
        }.also { _Insert = it}
