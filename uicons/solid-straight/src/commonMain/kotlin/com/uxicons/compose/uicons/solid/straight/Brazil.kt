package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Brazil: ImageVector? = null

val Icons.Ss.Brazil: ImageVector
    get() = _Brazil ?: UXIcon(name = "Brazil") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(9f, 14f)
                curveToRelative(-0.5f, 0f, -1f, -0.5f, -1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-1f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                verticalLineToRelative(-1f)
                horizontalLineTo(3f)
                lineToRelative(-2f, -1f)
                verticalLineToRelative(-2f)
                reflectiveCurveToRelative(2f, -1.5f, 2f, -1.5f)
                verticalLineTo(2.5f)
                reflectiveCurveToRelative(1.5f, -1f, 1.5f, -1f)
                curveToRelative(0f, 0f, 0.82f, 1.72f, 1.31f, 1.54f)
                curveToRelative(0.42f, -0.15f, 0.19f, -2.04f, 0.19f, -2.04f)
                lineToRelative(2.62f, -1f)
                lineToRelative(1.39f, 2f)
                horizontalLineToRelative(1f)
                lineToRelative(2f, -1.5f)
                lineToRelative(1.5f, 1f)
                lineToRelative(-0.01f, 1.4f)
                lineToRelative(2.15f, 0.77f)
                curveToRelative(1.56f, 0.56f, 3.03f, 1.34f, 4.36f, 2.34f)
                horizontalLineToRelative(0f)
                reflectiveCurveToRelative(2f, 0f, 2f, 0f)
                verticalLineToRelative(3.5f)
                curveToRelative(-0.27f, 0.56f, -2.5f, 2f, -3f, 2.5f)
                verticalLineToRelative(0.5f)
                curveToRelative(0f, 3.12f, -2.12f, 4.45f, -2.5f, 4.5f)
                curveToRelative(-1.36f, 0.17f, -1.85f, 1.09f, -2.21f, 2.4f)
                curveToRelative(-0.79f, 3.1f, -3.29f, 4.6f, -3.29f, 4.6f)
                curveToRelative(0f, 0f, -3f, -2f, -3f, -3f)
                curveToRelative(0.51f, -0.73f, 2f, -1.33f, 2f, -1.33f)
                verticalLineToRelative(-1.17f)
                lineToRelative(-2f, -2f)
                verticalLineToRelative(-2.5f)
                close()
            }
        }.also { _Brazil = it}
