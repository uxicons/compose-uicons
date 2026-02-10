package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Transcript: ImageVector? = null

val Icons.Ts.Transcript: ImageVector
    get() = _Transcript ?: UXIcon(name = "Transcript") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(12f, 6f)
                horizontalLineToRelative(-7f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(7f)
                close()
                moveTo(19f, 13f)
                horizontalLineToRelative(-14f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(14f)
                close()
                moveTo(19f, 18f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-8f)
                verticalLineToRelative(1f)
                close()
                moveTo(5f, 10f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-7f)
                close()
                moveTo(24f, 6f)
                curveToRelative(0f, -1.1f, -0.9f, -2f, -2f, -2f)
                verticalLineToRelative(1f)
                curveToRelative(0.55f, 0f, 1f, 0.45f, 1f, 1f)
                reflectiveCurveToRelative(-0.45f, 1f, -1f, 1f)
                verticalLineToRelative(1f)
                curveToRelative(1.1f, 0f, 2f, -0.9f, 2f, -2f)
                close()
                moveTo(21f, 12f)
                lineTo(17.28f, 9f)
                horizontalLineToRelative(-1.78f)
                curveToRelative(-0.83f, 0f, -1.5f, -0.67f, -1.5f, -1.5f)
                verticalLineToRelative(-3f)
                curveToRelative(0f, -0.83f, 0.67f, -1.5f, 1.5f, -1.5f)
                horizontalLineToRelative(1.78f)
                lineToRelative(3.72f, -3f)
                close()
                moveTo(20f, 2.12f)
                lineTo(17.63f, 4f)
                horizontalLineToRelative(-2.13f)
                curveToRelative(-0.28f, 0f, -0.5f, 0.22f, -0.5f, 0.5f)
                verticalLineToRelative(3f)
                curveToRelative(0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f)
                horizontalLineToRelative(2.13f)
                lineToRelative(2.37f, 1.89f)
                close()
                moveTo(23f, 9.86f)
                curveToRelative(0.35f, -0.1f, 0.69f, -0.24f, 1f, -0.42f)
                verticalLineToRelative(12.06f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                horizontalLineToRelative(-14.21f)
                lineToRelative(-7.29f, -7.29f)
                verticalLineToRelative(-16.71f)
                horizontalLineToRelative(17.78f)
                lineToRelative(-1.22f, 1f)
                horizontalLineToRelative(-15.56f)
                verticalLineToRelative(15f)
                horizontalLineToRelative(7f)
                verticalLineToRelative(7f)
                horizontalLineToRelative(13.5f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                close()
                moveTo(7f, 17f)
                horizontalLineToRelative(-5.29f)
                lineToRelative(5.29f, 5.29f)
                close()
            }
        }.also { _Transcript = it}
