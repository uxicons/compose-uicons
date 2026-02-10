package com.uxicons.compose.uicons.thin.rounded

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _BookBookmark: ImageVector? = null

val Icons.Tr.BookBookmark: ImageVector
    get() = _BookBookmark ?: UXIcon(name = "BookBookmark") {
            path(fill = SolidColor(Color.Black)) {
                moveTo(17.5f, 0f)
                lineTo(6.5f, 0f)
                curveTo(4.02f, 0f, 2f, 2.02f, 2f, 4.5f)
                lineTo(2f, 20.5f)
                curveToRelative(0f, 1.93f, 1.57f, 3.5f, 3.5f, 3.5f)
                horizontalLineToRelative(12f)
                curveToRelative(2.48f, 0f, 4.5f, -2.02f, 4.5f, -4.5f)
                lineTo(22f, 4.5f)
                curveToRelative(0f, -2.48f, -2.02f, -4.5f, -4.5f, -4.5f)
                close()
                moveTo(21f, 4.5f)
                verticalLineToRelative(12.5f)
                lineTo(7f, 17f)
                lineTo(7f, 1f)
                horizontalLineToRelative(5f)
                lineTo(12f, 9.85f)
                curveToRelative(0f, 0.5f, 0.31f, 0.93f, 0.78f, 1.09f)
                curveToRelative(0.48f, 0.16f, 0.98f, 0.01f, 1.28f, -0.39f)
                lineToRelative(0.93f, -1.22f)
                lineToRelative(0.93f, 1.22f)
                curveToRelative(0.31f, 0.4f, 0.82f, 0.55f, 1.28f, 0.39f)
                curveToRelative(0.47f, -0.16f, 0.78f, -0.59f, 0.78f, -1.09f)
                lineTo(18f, 1.04f)
                curveToRelative(1.69f, 0.24f, 3f, 1.7f, 3f, 3.46f)
                close()
                moveTo(13f, 1f)
                horizontalLineToRelative(4f)
                lineTo(17f, 9.85f)
                curveToRelative(0f, 0.09f, -0.06f, 0.13f, -0.1f, 0.14f)
                curveToRelative(-0.05f, 0.01f, -0.11f, 0.02f, -0.17f, -0.05f)
                lineToRelative(-1.33f, -1.74f)
                curveToRelative(-0.19f, -0.25f, -0.6f, -0.25f, -0.8f, 0f)
                lineToRelative(-1.33f, 1.74f)
                curveToRelative(-0.06f, 0.07f, -0.12f, 0.07f, -0.17f, 0.05f)
                curveToRelative(-0.05f, -0.02f, -0.1f, -0.05f, -0.1f, -0.14f)
                lineTo(13.0f, 1f)
                close()
                moveTo(3f, 4.5f)
                curveToRelative(0f, -1.76f, 1.31f, -3.22f, 3f, -3.46f)
                verticalLineToRelative(15.96f)
                horizontalLineToRelative(-0.5f)
                curveToRelative(-0.98f, 0f, -1.86f, 0.4f, -2.5f, 1.05f)
                lineTo(3f, 4.5f)
                close()
                moveTo(17.5f, 23f)
                lineTo(5.5f, 23f)
                curveToRelative(-3.29f, -0.06f, -3.28f, -4.94f, 0f, -5f)
                horizontalLineToRelative(15.5f)
                verticalLineToRelative(1.5f)
                curveToRelative(0f, 1.93f, -1.57f, 3.5f, -3.5f, 3.5f)
                close()
            }
        }.also { _BookBookmark = it}
