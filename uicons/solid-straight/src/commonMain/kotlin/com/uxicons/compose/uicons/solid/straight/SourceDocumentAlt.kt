package com.uxicons.compose.uicons.solid.straight

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _SourceDocumentAlt: ImageVector? = null

val Icons.Ss.SourceDocumentAlt: ImageVector
    get() = _SourceDocumentAlt ?: UXIcon(name = "SourceDocumentAlt") {
            path(fill = SolidColor(Color.Black)) {
                moveToRelative(20.5f, 17f)
                curveToRelative(-1.93f, 0f, -3.5f, 1.57f, -3.5f, 3.5f)
                reflectiveCurveToRelative(1.57f, 3.5f, 3.5f, 3.5f)
                reflectiveCurveToRelative(3.5f, -1.57f, 3.5f, -3.5f)
                reflectiveCurveToRelative(-1.57f, -3.5f, -3.5f, -3.5f)
                close()
                moveTo(10f, 8.59f)
                lineTo(10f, 2.09f)
                lineTo(7.91f, 0f)
                lineTo(2f, 0f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(6.59f)
                lineToRelative(4.46f, 4.46f)
                lineToRelative(-1.54f, 1.54f)
                horizontalLineToRelative(3.5f)
                curveToRelative(0.55f, 0f, 1f, -0.45f, 1f, -1f)
                verticalLineToRelative(-3.5f)
                lineToRelative(-1.54f, 1.54f)
                lineToRelative(-4.46f, -4.46f)
                close()
                moveTo(13f, 18f)
                verticalLineToRelative(2f)
                horizontalLineToRelative(-3f)
                verticalLineToRelative(-3.91f)
                lineToRelative(-2.09f, -2.09f)
                lineTo(2f, 14f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(8f)
                verticalLineToRelative(-2f)
                horizontalLineToRelative(3f)
                verticalLineToRelative(2f)
                lineToRelative(2.7f, -2.32f)
                curveToRelative(0.4f, -0.36f, 0.4f, -0.99f, 0f, -1.35f)
                lineToRelative(-2.7f, -2.32f)
                close()
                moveTo(20f, 13f)
                horizontalLineToRelative(-2f)
                lineToRelative(2.32f, 2.7f)
                curveToRelative(0.36f, 0.4f, 0.99f, 0.4f, 1.35f, 0f)
                lineToRelative(2.32f, -2.7f)
                horizontalLineToRelative(-2f)
                lineTo(22.0f, 2.09f)
                lineToRelative(-2.09f, -2.09f)
                horizontalLineToRelative(-5.91f)
                verticalLineToRelative(10f)
                horizontalLineToRelative(6f)
                verticalLineToRelative(3f)
                close()
            }
        }.also { _SourceDocumentAlt = it}
