package com.uxicons.compose.uicons.brand

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import com.uxicons.compose.uicons.Icons
import com.uxicons.compose.uicons.core.UXIcon

private var _Jira: ImageVector? = null

val Icons.Brand.Jira: ImageVector
    get() = _Jira ?: UXIcon(name = "Jira") {
        path(fill = SolidColor(Color.Black)) {
            moveTo(23.01f, 0f)
            horizontalLineTo(11.45f)
            curveToRelative(0f, 2.88f, 2.33f, 5.21f, 5.21f, 5.21f)
            horizontalLineToRelative(2.13f)
            verticalLineToRelative(2.06f)
            curveToRelative(0f, 2.88f, 2.33f, 5.21f, 5.21f, 5.21f)
            verticalLineTo(0.99f)
            curveTo(24f, 0.45f, 23.55f, 0f, 23.01f, 0f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(17.28f, 5.76f)
            horizontalLineTo(5.73f)
            curveToRelative(0f, 2.88f, 2.33f, 5.21f, 5.21f, 5.21f)
            horizontalLineToRelative(2.13f)
            verticalLineToRelative(2.06f)
            curveToRelative(0f, 2.88f, 2.33f, 5.21f, 5.21f, 5.21f)
            verticalLineTo(6.75f)
            curveTo(18.27f, 6.21f, 17.83f, 5.76f, 17.28f, 5.76f)
            close()
        }
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.55f, 11.52f)
            horizontalLineTo(0f)
            curveToRelative(0f, 2.88f, 2.33f, 5.21f, 5.21f, 5.21f)
            horizontalLineToRelative(2.13f)
            verticalLineToRelative(2.06f)
            curveToRelative(0f, 2.88f, 2.33f, 5.21f, 5.21f, 5.21f)
            verticalLineTo(12.51f)
            curveTo(12.55f, 11.97f, 12.1f, 11.52f, 11.55f, 11.52f)
            close()
        }
    }.also { _Jira = it }
