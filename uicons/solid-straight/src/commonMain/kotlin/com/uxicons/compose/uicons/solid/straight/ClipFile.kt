package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _ClipFile: ImageVector? = null

val Icons.Ss.ClipFile: ImageVector
    get() = _ClipFile ?: UXIcon(name = "ClipFile") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(19f, 0f)
                horizontalLineToRelative(-1.56f)
                curveToRelative(0.34f, 0.59f, 0.56f, 1.27f, 0.56f, 2f)
                verticalLineToRelative(8.38f)
                curveToRelative(0f, 1.17f, -0.74f, 2.27f, -1.87f, 2.55f)
                curveToRelative(-1.65f, 0.4f, -3.13f, -0.84f, -3.13f, -2.42f)
                lineTo(13f, 2f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(8.5f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                reflectiveCurveToRelative(0.5f, -0.22f, 0.5f, -0.5f)
                lineTo(16f, 2.09f)
                curveToRelative(0f, -0.87f, -0.51f, -1.72f, -1.34f, -1.98f)
                curveToRelative(-1.38f, -0.44f, -2.66f, 0.58f, -2.66f, 1.9f)
                verticalLineToRelative(8f)
                horizontalLineToRelative(-2f)
                lineTo(10f, 2f)
                curveToRelative(0f, -0.73f, 0.21f, -1.41f, 0.56f, -2f)
                horizontalLineToRelative(-5.56f)
                curveToRelative(-1.66f, 0f, -3f, 1.34f, -3f, 3f)
                verticalLineToRelative(21f)
                horizontalLineToRelative(20f)
                lineTo(22f, 3f)
                curveToRelative(0f, -1.66f, -1.34f, -3f, -3f, -3f)
                close()
                moveTo(6f, 13f)
                horizontalLineToRelative(5.76f)
                curveToRelative(0.81f, 1.21f, 2.18f, 2f, 3.74f, 2f)
                lineTo(6f, 15f)
                verticalLineToRelative(-2f)
                close()
                moveTo(18f, 19f)
                lineTo(6f, 19f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(12f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _ClipFile = it}
