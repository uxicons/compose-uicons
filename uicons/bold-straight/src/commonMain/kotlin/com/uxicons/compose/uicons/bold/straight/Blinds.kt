package com.uxicons.compose.uicons.bold.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Blinds: ImageVector? = null

val Icons.Bs.Blinds: ImageVector
    get() = _Blinds ?: UXIcon(name = "Blinds") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 17.34f)
                lineTo(22f, 3.5f)
                curveToRelative(0f, -1.93f, -1.57f, -3.5f, -3.5f, -3.5f)
                lineTo(3.5f, 0f)
                curveTo(1.57f, 0f, 0f, 1.57f, 0f, 3.5f)
                lineTo(0f, 23f)
                lineTo(15.61f, 23f)
                curveToRelative(-0.38f, -0.75f, -0.6f, -1.6f, -0.6f, -2.5f)
                curveToRelative(0f, -0.17f, 0.01f, -0.34f, 0.03f, -0.5f)
                lineTo(3f, 20f)
                verticalLineToRelative(-2f)
                lineTo(15.61f, 18f)
                curveToRelative(0.34f, -0.67f, 0.82f, -1.27f, 1.39f, -1.74f)
                lineTo(17f, 3f)
                horizontalLineToRelative(1.5f)
                curveToRelative(0.28f, 0f, 0.5f, 0.22f, 0.5f, 0.5f)
                verticalLineToRelative(13.84f)
                curveToRelative(-1.18f, 0.56f, -2f, 1.77f, -2f, 3.16f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                curveToRelative(0f, -1.39f, -0.82f, -2.6f, -2f, -3.16f)
                close()
                moveTo(14f, 10f)
                lineTo(3f, 10f)
                verticalLineToRelative(-2f)
                lineTo(14f, 8f)
                verticalLineToRelative(2f)
                close()
                moveTo(3f, 15f)
                verticalLineToRelative(-2f)
                lineTo(14f, 13f)
                verticalLineToRelative(2f)
                lineTo(3f, 15f)
                close()
                moveTo(14f, 5f)
                lineTo(3f, 5f)
                verticalLineToRelative(-1.5f)
                curveToRelative(0f, -0.28f, 0.23f, -0.5f, 0.5f, -0.5f)
                lineTo(14f, 3f)
                verticalLineToRelative(2f)
                close()
            }
        }.also { _Blinds = it}
