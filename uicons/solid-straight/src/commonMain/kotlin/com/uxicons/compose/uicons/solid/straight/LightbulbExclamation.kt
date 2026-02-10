package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _LightbulbExclamation: ImageVector? = null

val Icons.Ss.LightbulbExclamation: ImageVector
    get() = _LightbulbExclamation ?: UXIcon(name = "LightbulbExclamation") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(5.87f, 15.58f)
                curveToRelative(0.77f, 0.72f, 1.34f, 1.54f, 1.7f, 2.42f)
                horizontalLineToRelative(8.84f)
                curveToRelative(0.33f, -0.88f, 0.84f, -1.64f, 1.52f, -2.24f)
                curveToRelative(1.95f, -1.71f, 3.07f, -4.17f, 3.07f, -6.76f)
                curveToRelative(0f, -2.56f, -1.1f, -5.01f, -3.01f, -6.71f)
                curveTo(16.09f, 0.58f, 13.52f, -0.23f, 10.96f, 0.06f)
                curveTo(6.9f, 0.52f, 3.59f, 3.78f, 3.08f, 7.82f)
                curveToRelative(-0.37f, 2.93f, 0.64f, 5.76f, 2.79f, 7.76f)
                close()
                moveTo(11f, 4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-7f)
                close()
                moveTo(11f, 13f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-2f)
                close()
                moveTo(16.01f, 20f)
                curveToRelative(-0.01f, 0.1f, -0.01f, 0.21f, -0.01f, 0.32f)
                verticalLineToRelative(3.69f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(-3.85f)
                curveToRelative(0f, -0.05f, 0f, -0.1f, -0.0f, -0.15f)
                horizontalLineToRelative(8.01f)
                close()
            }
        }.also { _LightbulbExclamation = it}
