package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Blinds: ImageVector? = null

val Icons.Tr.Blinds: ImageVector
    get() = _Blinds ?: UXIcon(name = "Blinds") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(22f, 19.05f)
                lineTo(22f, 4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                lineTo(4.5f, 0f)
                curveTo(2.02f, 0f, 0f, 2.02f, 0f, 4.5f)
                verticalLineToRelative(12f)
                curveToRelative(0f, 2.48f, 2.02f, 4.5f, 4.5f, 4.5f)
                horizontalLineToRelative(12f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                reflectiveCurveToRelative(-0.22f, -0.5f, -0.5f, -0.5f)
                lineTo(4.5f, 20f)
                curveToRelative(-1.76f, 0f, -3.22f, -1.31f, -3.46f, -3f)
                lineTo(18.5f, 17f)
                curveToRelative(0.28f, 0f, 0.5f, -0.22f, 0.5f, -0.5f)
                lineTo(19f, 1.34f)
                curveToRelative(1.18f, 0.56f, 2f, 1.77f, 2f, 3.16f)
                verticalLineToRelative(14.55f)
                curveToRelative(-1.14f, 0.23f, -2f, 1.24f, -2f, 2.45f)
                curveToRelative(0f, 1.38f, 1.12f, 2.5f, 2.5f, 2.5f)
                reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
                curveToRelative(0f, -1.21f, -0.86f, -2.22f, -2f, -2.45f)
                close()
                moveTo(1f, 9f)
                lineTo(18f, 9f)
                verticalLineToRelative(3f)
                lineTo(1f, 12f)
                verticalLineToRelative(-3f)
                close()
                moveTo(18f, 8f)
                lineTo(1f, 8f)
                verticalLineToRelative(-3f)
                lineTo(18f, 5f)
                verticalLineToRelative(3f)
                close()
                moveTo(1f, 16f)
                verticalLineToRelative(-3f)
                lineTo(18f, 13f)
                verticalLineToRelative(3f)
                lineTo(1f, 16f)
                close()
                moveTo(18f, 4f)
                lineTo(1.04f, 4f)
                curveToRelative(0.24f, -1.69f, 1.7f, -3f, 3.46f, -3f)
                horizontalLineToRelative(13f)
                curveToRelative(0.17f, 0f, 0.34f, 0.01f, 0.5f, 0.04f)
                verticalLineToRelative(2.96f)
                close()
                moveTo(21.5f, 23f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f)
                reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f)
                reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f)
                close()
            }
        }.also { _Blinds = it}
