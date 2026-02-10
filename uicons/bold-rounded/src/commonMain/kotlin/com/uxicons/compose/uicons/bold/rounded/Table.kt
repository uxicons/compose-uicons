package com.uxicons.compose.uicons.bold.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Table: ImageVector? = null

val Icons.Br.Table: ImageVector
    get() = _Table ?: UXIcon(name = "Table") {
        path(fill = SolidColor(Color.Black)) {
            moveToRelative(23.44f, 5.09f)
            curveToRelative(-0.07f, -0.24f, -0.19f, -0.45f, -0.35f, -0.62f)
            curveToRelative(-0.99f, -1.49f, -2.67f, -2.47f, -4.58f, -2.47f)
            lineTo(5.5f, 2f)
            curveToRelative(-1.91f, 0f, -3.6f, 0.98f, -4.58f, 2.47f)
            curveToRelative(-0.17f, 0.17f, -0.28f, 0.39f, -0.35f, 0.62f)
            curveToRelative(-0.36f, 0.73f, -0.56f, 1.54f, -0.56f, 2.41f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 3.03f, 2.47f, 5.5f, 5.5f, 5.5f)
            horizontalLineToRelative(13f)
            curveToRelative(3.03f, 0f, 5.5f, -2.47f, 5.5f, -5.5f)
            lineTo(24f, 7.5f)
            curveToRelative(0f, -0.86f, -0.21f, -1.68f, -0.56f, -2.41f)
            close()
            moveTo(3f, 7.5f)
            curveToRelative(0f, -0.17f, 0.02f, -0.34f, 0.05f, -0.5f)
            horizontalLineToRelative(7.45f)
            verticalLineToRelative(4.5f)
            lineTo(3f, 11.5f)
            verticalLineToRelative(-4f)
            close()
            moveTo(13.5f, 7f)
            horizontalLineToRelative(7.45f)
            curveToRelative(0.03f, 0.16f, 0.05f, 0.33f, 0.05f, 0.5f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(-7.5f)
            verticalLineToRelative(-4.5f)
            close()
            moveTo(3f, 16.5f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(7.5f)
            verticalLineToRelative(4.5f)
            horizontalLineToRelative(-5f)
            curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
            close()
            moveTo(18.5f, 19f)
            horizontalLineToRelative(-5f)
            verticalLineToRelative(-4.5f)
            horizontalLineToRelative(7.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            close()
        }
    }.also { _Table = it }
