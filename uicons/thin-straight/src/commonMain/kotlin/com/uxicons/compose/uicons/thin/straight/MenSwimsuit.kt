package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _MenSwimsuit: ImageVector? = null

val Icons.Ts.MenSwimsuit: ImageVector
    get() = _MenSwimsuit ?: UXIcon(name = "MenSwimsuit") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(0f, 3f)
                verticalLineToRelative(8.71f)
                curveToRelative(0.13f, 0.1f, 8.48f, 8.67f, 8.63f, 8.72f)
                curveToRelative(0.05f, 0.02f, 1.18f, 0.58f, 3.37f, 0.58f)
                reflectiveCurveToRelative(3.32f, -0.55f, 3.37f, -0.58f)
                lineToRelative(8.63f, -8.72f)
                verticalLineToRelative(-8.71f)
                close()
                moveTo(1f, 4f)
                horizontalLineToRelative(5f)
                verticalLineToRelative(7.86f)
                curveToRelative(-1.38f, -0.88f, -3.06f, -1.36f, -5f, -1.36f)
                close()
                moveTo(1.21f, 11.51f)
                curveToRelative(4.56f, 0.09f, 7.47f, 3.06f, 7.76f, 7.87f)
                close()
                moveTo(9.99f, 19.8f)
                curveToRelative(-0.08f, -3.09f, -1.15f, -5.58f, -2.99f, -7.2f)
                verticalLineToRelative(-8.6f)
                horizontalLineToRelative(10f)
                verticalLineToRelative(8.6f)
                curveToRelative(-1.83f, 1.62f, -2.91f, 4.11f, -2.99f, 7.2f)
                curveToRelative(-0.48f, 0.1f, -1.15f, 0.2f, -2.01f, 0.2f)
                reflectiveCurveToRelative(-1.53f, -0.09f, -2.01f, -0.2f)
                close()
                moveTo(15.03f, 19.38f)
                curveToRelative(0.29f, -4.8f, 3.2f, -7.78f, 7.76f, -7.87f)
                close()
                moveTo(23f, 10.5f)
                curveToRelative(-1.94f, 0f, -3.62f, 0.48f, -5f, 1.36f)
                verticalLineToRelative(-7.86f)
                horizontalLineToRelative(5f)
                close()
            }
        }.also { _MenSwimsuit = it}
