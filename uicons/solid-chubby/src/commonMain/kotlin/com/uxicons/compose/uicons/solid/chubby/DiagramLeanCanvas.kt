package com.uxicons.compose.uicons.solid.chubby

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _DiagramLeanCanvas: ImageVector? = null

val Icons.Sc.DiagramLeanCanvas: ImageVector
    get() = _DiagramLeanCanvas ?: UXIcon(name = "DiagramLeanCanvas") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(9f, 15f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-5f)
                horizontalLineToRelative(2f)
                close()
                moveTo(9f, 3.09f)
                curveToRelative(-0.73f, 0.05f, -1.4f, 0.11f, -2f, 0.18f)
                verticalLineToRelative(4.73f)
                horizontalLineToRelative(2f)
                close()
                moveTo(17f, 10f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(2f)
                close()
                moveTo(17f, 3.27f)
                curveToRelative(-0.6f, -0.07f, -1.27f, -0.13f, -2f, -0.18f)
                verticalLineToRelative(4.91f)
                horizontalLineToRelative(2f)
                close()
                moveTo(13f, 3.01f)
                curveToRelative(-0.33f, -0.01f, -0.66f, -0.01f, -1f, -0.01f)
                reflectiveCurveToRelative(-0.68f, 0.0f, -1f, 0.01f)
                verticalLineToRelative(11.99f)
                horizontalLineToRelative(2f)
                close()
                moveTo(13f, 20.99f)
                curveToRelative(5.44f, -0.11f, 8.21f, -1.07f, 8.34f, -1.11f)
                curveToRelative(0.28f, -0.1f, 0.5f, -0.32f, 0.6f, -0.59f)
                curveToRelative(0.02f, -0.06f, 0.32f, -0.88f, 0.6f, -2.29f)
                horizontalLineToRelative(-9.53f)
                close()
                moveTo(21.94f, 4.71f)
                curveToRelative(-0.1f, -0.28f, -0.32f, -0.49f, -0.6f, -0.59f)
                curveToRelative(-0.06f, -0.02f, -0.84f, -0.29f, -2.33f, -0.56f)
                verticalLineToRelative(11.44f)
                horizontalLineToRelative(3.84f)
                curveToRelative(0.1f, -0.89f, 0.16f, -1.89f, 0.16f, -3f)
                curveToRelative(0f, -4.4f, -1.02f, -7.17f, -1.06f, -7.29f)
                close()
                moveTo(5f, 3.56f)
                curveToRelative(-1.49f, 0.27f, -2.27f, 0.54f, -2.33f, 0.56f)
                curveToRelative(-0.28f, 0.1f, -0.5f, 0.32f, -0.6f, 0.59f)
                curveToRelative(-0.04f, 0.12f, -1.06f, 2.89f, -1.06f, 7.29f)
                curveToRelative(0f, 1.11f, 0.07f, 2.11f, 0.16f, 3f)
                horizontalLineToRelative(3.84f)
                close()
                moveTo(2.06f, 19.29f)
                curveToRelative(0.1f, 0.28f, 0.32f, 0.49f, 0.6f, 0.59f)
                curveToRelative(0.12f, 0.04f, 2.9f, 1.0f, 8.34f, 1.11f)
                verticalLineToRelative(-3.99f)
                horizontalLineToRelative(-9.53f)
                curveToRelative(0.28f, 1.41f, 0.57f, 2.22f, 0.6f, 2.29f)
                close()
            }
        }.also { _DiagramLeanCanvas = it}
