package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _EyeScanner: ImageVector? = null

val Icons.Ss.EyeScanner: ImageVector
    get() = _EyeScanner ?: UXIcon(name = "EyeScanner") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(2f, 7f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.65f, 1.35f, -3f, 3f, -3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, 0.45f, -1f, 1f)
                close()
                moveTo(21f, 0f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                verticalLineToRelative(4f)
                horizontalLineToRelative(2f)
                verticalLineToRelative(-4f)
                curveToRelative(0f, -1.65f, -1.35f, -3f, -3f, -3f)
                close()
                moveTo(2f, 21f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                verticalLineToRelative(4f)
                curveToRelative(0f, 1.65f, 1.35f, 3f, 3f, 3f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(-4f)
                curveToRelative(-0.55f, 0f, -1f, -0.45f, -1f, -1f)
                close()
                moveTo(22f, 21f)
                curveToRelative(0f, 0.55f, -0.45f, 1f, -1f, 1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(4f)
                curveToRelative(1.65f, 0f, 3f, -1.35f, 3f, -3f)
                verticalLineToRelative(-4f)
                horizontalLineToRelative(-2f)
                close()
                moveTo(22.16f, 14f)
                horizontalLineToRelative(-6.71f)
                curveToRelative(-0.69f, 1.19f, -1.97f, 2f, -3.44f, 2f)
                reflectiveCurveToRelative(-2.75f, -0.81f, -3.44f, -2f)
                horizontalLineToRelative(-6.71f)
                curveToRelative(1.39f, 2.27f, 4.52f, 6f, 10.16f, 6f)
                reflectiveCurveToRelative(8.77f, -3.73f, 10.16f, -6f)
                close()
                moveTo(22.15f, 10f)
                horizontalLineToRelative(1.85f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-24f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(1.85f)
                curveToRelative(1.35f, -2.2f, 4.5f, -6f, 10.15f, -6f)
                reflectiveCurveToRelative(8.8f, 3.8f, 10.15f, 6f)
                close()
                moveTo(8.56f, 10f)
                horizontalLineToRelative(6.87f)
                curveToRelative(-0.69f, -1.19f, -1.96f, -2f, -3.44f, -2f)
                reflectiveCurveToRelative(-2.75f, 0.81f, -3.44f, 2f)
                close()
            }
        }.also { _EyeScanner = it}
