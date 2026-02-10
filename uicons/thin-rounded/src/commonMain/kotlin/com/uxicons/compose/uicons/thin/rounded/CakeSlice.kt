package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _CakeSlice: ImageVector? = null

val Icons.Tr.CakeSlice: ImageVector
    get() = _CakeSlice ?: UXIcon(name = "CakeSlice") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.32f, 9.43f)
                curveToRelative(-1.03f, -1.89f, -3.35f, -5.5f, -7.35f, -8.49f)
                curveToRelative(-0.83f, -0.62f, -1.84f, -0.95f, -2.89f, -0.93f)
                curveToRelative(-0.95f, 0.01f, -1.88f, 0.3f, -2.68f, 0.83f)
                curveToRelative(-0.03f, 0.02f, -8.9f, 9.38f, -8.9f, 9.38f)
                curveToRelative(-0.97f, 1.02f, -1.51f, 2.37f, -1.51f, 3.78f)
                verticalLineToRelative(5.51f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(15f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                verticalLineToRelative(-7.38f)
                curveToRelative(0f, -0.95f, -0.23f, -1.89f, -0.68f, -2.7f)
                close()
                moveTo(1f, 19f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(22f)
                verticalLineToRelative(2f)
                lineTo(1f, 19f)
                close()
                moveTo(1f, 13.99f)
                curveToRelative(0f, -0.34f, 0.05f, -0.67f, 0.12f, -0.99f)
                horizontalLineToRelative(21.88f)
                verticalLineToRelative(3f)
                lineTo(1f, 16f)
                verticalLineToRelative(-2.01f)
                close()
                moveTo(2.23f, 10.9f)
                lineTo(11.01f, 1.63f)
                curveToRelative(0.62f, -0.41f, 1.35f, -0.62f, 2.09f, -0.63f)
                curveToRelative(0.78f, -0.02f, 1.62f, 0.24f, 2.28f, 0.73f)
                curveToRelative(3.85f, 2.88f, 6.08f, 6.35f, 7.07f, 8.17f)
                curveToRelative(0.34f, 0.63f, 0.53f, 1.35f, 0.55f, 2.1f)
                lineTo(1.49f, 12f)
                curveToRelative(0.2f, -0.4f, 0.44f, -0.77f, 0.75f, -1.1f)
                close()
                moveTo(19.5f, 23.0f)
                lineTo(4.5f, 23.0f)
                curveToRelative(-1.76f, 0f, -3.2f, -1.31f, -3.45f, -3f)
                horizontalLineToRelative(21.9f)
                curveToRelative(-0.24f, 1.69f, -1.69f, 3f, -3.45f, 3f)
                close()
            }
        }.also { _CakeSlice = it}
