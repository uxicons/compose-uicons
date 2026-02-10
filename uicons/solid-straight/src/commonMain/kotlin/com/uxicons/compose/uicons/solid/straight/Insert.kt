package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Insert: ImageVector? = null

val Icons.Ss.Insert: ImageVector
    get() = _Insert ?: UXIcon(name = "Insert") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(10.59f, 17.41f)
                lineToRelative(-4.79f, -4.7f)
                lineToRelative(1.4f, -1.43f)
                lineToRelative(3.8f, 3.73f)
                lineTo(11.0f, 0f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(15.01f)
                lineToRelative(3.8f, -3.72f)
                lineToRelative(1.4f, 1.43f)
                lineToRelative(-4.79f, 4.71f)
                curveToRelative(-0.39f, 0.39f, -0.9f, 0.58f, -1.41f, 0.58f)
                reflectiveCurveToRelative(-1.03f, -0.2f, -1.42f, -0.59f)
                close()
                moveTo(19f, 16f)
                verticalLineToRelative(5f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                lineTo(6f, 22f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-5f)
                lineTo(0f, 16f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(12f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-3f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-5f)
                close()
            }
        }.also { _Insert = it}
