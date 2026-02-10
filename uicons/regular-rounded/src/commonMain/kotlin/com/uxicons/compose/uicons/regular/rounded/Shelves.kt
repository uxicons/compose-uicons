package com.uxicons.compose.uicons.regular.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Shelves: ImageVector? = null

val Icons.Rr.Shelves: ImageVector
    get() = _Shelves ?: UXIcon(name = "Shelves") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(23f, 0f)
                horizontalLineToRelative(-5f)
                curveToRelative(-1.65f, 0f, -3f, 1.35f, -3f, 3f)
                verticalLineToRelative(4f)
                lineTo(2f, 7f)
                lineTo(2f, 1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                reflectiveCurveTo(0f, 0.45f, 0f, 1f)
                verticalLineToRelative(22f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(2f)
                curveToRelative(0f, 0.55f, 0.45f, 1f, 1f, 1f)
                reflectiveCurveToRelative(1f, -0.45f, 1f, -1f)
                lineTo(24f, 1f)
                curveToRelative(0f, -0.55f, -0.45f, -1f, -1f, -1f)
                close()
                moveTo(17f, 3f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(5f)
                horizontalLineToRelative(-5f)
                lineTo(17f, 3f)
                close()
                moveTo(2f, 15f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4f)
                lineTo(2f, 19f)
                verticalLineToRelative(-4f)
                close()
                moveTo(14f, 19f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -0.55f, 0.45f, -1f, 1f, -1f)
                horizontalLineToRelative(3f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4f)
                close()
                moveTo(16f, 19f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.77f, 0f, -1.47f, 0.29f, -2f, 0.77f)
                curveToRelative(-0.53f, -0.48f, -1.23f, -0.77f, -2f, -0.77f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.35f, 0f, -0.69f, 0.06f, -1f, 0.17f)
                verticalLineToRelative(-3.17f)
                horizontalLineToRelative(20f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(-6f)
                close()
            }
        }.also { _Shelves = it}
