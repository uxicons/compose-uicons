package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Completed: ImageVector? = null

val Icons.Ts.Completed: ImageVector
    get() = _Completed ?: UXIcon(name = "Completed") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(13f, 11f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(-1f)
                close()
                moveTo(21f, 2f)
                verticalLineToRelative(19.5f)
                curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
                lineTo(5.5f, 24f)
                curveToRelative(-1.38f, 0f, -2.5f, -1.12f, -2.5f, -2.5f)
                lineTo(3f, 2f)
                horizontalLineToRelative(5.05f)
                curveToRelative(0.23f, -1.14f, 1.24f, -2f, 2.45f, -2f)
                horizontalLineToRelative(3f)
                curveToRelative(1.21f, 0f, 2.22f, 0.86f, 2.45f, 2f)
                horizontalLineToRelative(5.05f)
                close()
                moveTo(20f, 3f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(-0.5f)
                curveToRelative(0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f)
                horizontalLineToRelative(-3f)
                curveToRelative(-0.83f, 0f, -1.5f, 0.67f, -1.5f, 1.5f)
                verticalLineToRelative(0.5f)
                horizontalLineToRelative(-5f)
                verticalLineToRelative(18.5f)
                curveToRelative(0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f)
                horizontalLineToRelative(13f)
                curveToRelative(0.83f, 0f, 1.5f, -0.67f, 1.5f, -1.5f)
                lineTo(20f, 3f)
                close()
                moveTo(8.78f, 10.95f)
                curveToRelative(-0.06f, 0.06f, -0.18f, 0.06f, -0.24f, -0.01f)
                lineToRelative(-1.78f, -1.72f)
                lineToRelative(-0.69f, 0.72f)
                lineToRelative(1.77f, 1.72f)
                curveToRelative(0.22f, 0.22f, 0.51f, 0.34f, 0.82f, 0.34f)
                reflectiveCurveToRelative(0.6f, -0.12f, 0.82f, -0.34f)
                lineToRelative(3.36f, -3.31f)
                lineToRelative(-0.7f, -0.71f)
                lineToRelative(-3.37f, 3.31f)
                close()
                moveTo(13f, 18f)
                horizontalLineToRelative(4f)
                verticalLineToRelative(-1f)
                horizontalLineToRelative(-4f)
                verticalLineToRelative(1f)
                close()
                moveTo(8.78f, 16.95f)
                curveToRelative(-0.06f, 0.06f, -0.18f, 0.06f, -0.24f, -0.01f)
                lineToRelative(-1.78f, -1.72f)
                lineToRelative(-0.69f, 0.72f)
                lineToRelative(1.77f, 1.72f)
                curveToRelative(0.22f, 0.22f, 0.51f, 0.34f, 0.82f, 0.34f)
                reflectiveCurveToRelative(0.6f, -0.12f, 0.82f, -0.34f)
                lineToRelative(3.36f, -3.31f)
                lineToRelative(-0.7f, -0.71f)
                lineToRelative(-3.37f, 3.31f)
                close()
            }
        }.also { _Completed = it}
