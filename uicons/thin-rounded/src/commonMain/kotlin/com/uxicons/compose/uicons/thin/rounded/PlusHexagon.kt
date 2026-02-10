package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _PlusHexagon: ImageVector? = null

val Icons.Tr.PlusHexagon: ImageVector
    get() = _PlusHexagon ?: UXIcon(name = "PlusHexagon") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23.46f, 9.75f)
                lineToRelative(-3.76f, -6.5f)
                curveToRelative(-0.8f, -1.39f, -2.29f, -2.25f, -3.9f, -2.25f)
                horizontalLineToRelative(-7.54f)
                curveToRelative(-1.6f, 0f, -3.09f, 0.86f, -3.9f, 2.25f)
                lineTo(0.6f, 9.75f)
                curveToRelative(-0.81f, 1.39f, -0.81f, 3.12f, 0f, 4.51f)
                lineToRelative(3.76f, 6.5f)
                curveToRelative(0.8f, 1.39f, 2.29f, 2.25f, 3.9f, 2.25f)
                horizontalLineToRelative(7.54f)
                curveToRelative(1.6f, 0f, 3.09f, -0.86f, 3.9f, -2.25f)
                lineToRelative(3.76f, -6.5f)
                curveToRelative(0.81f, -1.39f, 0.81f, -3.12f, 0f, -4.51f)
                close()
                moveTo(22.6f, 13.75f)
                lineToRelative(-3.76f, 6.5f)
                curveToRelative(-0.62f, 1.08f, -1.78f, 1.75f, -3.03f, 1.75f)
                horizontalLineToRelative(-7.54f)
                curveToRelative(-1.24f, 0f, -2.4f, -0.67f, -3.03f, -1.75f)
                lineToRelative(-3.76f, -6.5f)
                curveToRelative(-0.63f, -1.08f, -0.63f, -2.42f, 0f, -3.51f)
                lineToRelative(3.76f, -6.5f)
                curveToRelative(0.62f, -1.08f, 1.78f, -1.75f, 3.03f, -1.75f)
                horizontalLineToRelative(7.54f)
                curveToRelative(1.25f, 0f, 2.41f, 0.67f, 3.03f, 1.75f)
                lineToRelative(3.76f, 6.5f)
                curveToRelative(0.63f, 1.08f, 0.63f, 2.42f, 0f, 3.51f)
                close()
                moveTo(17f, 12f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 0.28f, -0.22f, 0.5f, -0.5f, 0.5f)
                reflectiveCurveToRelative(-0.5f, -0.22f, -0.5f, -0.5f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.28f, 0f, -0.5f, -0.22f, -0.5f, -0.5f)
                reflectiveCurveToRelative(0.22f, -0.5f, 0.5f, -0.5f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f)
                reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(4f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                close()
            }
        }.also { _PlusHexagon = it}
