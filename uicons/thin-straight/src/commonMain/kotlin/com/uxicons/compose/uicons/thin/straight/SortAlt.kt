package com.uxicons.compose.uicons.thin.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SortAlt: ImageVector? = null

val Icons.Ts.SortAlt: ImageVector
    get() = _SortAlt ?: UXIcon(name = "SortAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(11.62f, 18.12f)
                lineToRelative(0.71f, 0.71f)
                lineToRelative(-4.72f, 4.72f)
                curveToRelative(-0.3f, 0.3f, -0.69f, 0.46f, -1.11f, 0.46f)
                horizontalLineToRelative(0f)
                curveToRelative(-0.42f, 0f, -0.81f, -0.16f, -1.11f, -0.46f)
                lineTo(0.68f, 18.82f)
                lineToRelative(0.71f, -0.71f)
                lineToRelative(4.62f, 4.62f)
                verticalLineTo(0f)
                horizontalLineToRelative(1f)
                verticalLineTo(22.73f)
                lineToRelative(4.62f, -4.62f)
                close()
                moveTo(23.32f, 5.18f)
                lineTo(18.61f, 0.46f)
                curveToRelative(-0.59f, -0.59f, -1.62f, -0.59f, -2.21f, 0f)
                lineToRelative(-4.72f, 4.72f)
                lineToRelative(0.71f, 0.71f)
                lineTo(17f, 1.27f)
                verticalLineTo(24f)
                horizontalLineToRelative(1f)
                verticalLineTo(1.27f)
                lineToRelative(4.62f, 4.62f)
                lineToRelative(0.71f, -0.71f)
                close()
            }
        }.also { _SortAlt = it}
